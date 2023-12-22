package student.rest.internal.resource.v1_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.NoSuchUserException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.vulcan.pagination.Page;
import student.rest.dto.v1_0.Student;
import student.rest.resource.v1_0.StudentResource;

/**
 * @author prince
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/student.properties", scope = ServiceScope.PROTOTYPE, service = StudentResource.class)
public class StudentResourceImpl extends BaseStudentResourceImpl {
	@Reference
	private UserLocalService userLocalService;

	@Override
	public void setContextBatchUnsafeBiConsumer(
			UnsafeBiConsumer<Collection<Student>, UnsafeFunction<Student, Student, Exception>, Exception> contextBatchUnsafeBiConsumer) {

	}

	private Student mapUserToStudent(User user) {
		Student student = new Student();
		student.setId(user.getUserId());
		student.setFirstname(user.getFirstName());
		student.setLastname(user.getLastName());

		Serializable mobileNumberAttr = user.getExpandoBridge().getAttribute("mobilenumber");
		if (mobileNumberAttr != null) {
			student.setMobilenumber(String.valueOf(mobileNumberAttr));
		}

		return student;
	}

	public Page<Student> getAllStudents() throws Exception {
		List<Student> students = new ArrayList<>();

		List<User> users = userLocalService.getUsers(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		for (User user : users) {
			students.add(mapUserToStudent(user));

		}
		
		_log.error("------------------");
		return Page.of(students);
	}

	@Override
	public Response deleteStudentById(Long id) throws Exception {

		try {

			User user = userLocalService.getUser(id);

			if (user != null) {
				userLocalService.deleteUser(id);
				return Response.noContent().build();
			} else {

				return Response.status(Response.Status.NOT_FOUND).entity("Student not found").build();
			}
		} catch (NoSuchUserException e) {

			return Response.status(Response.Status.NOT_FOUND).entity("Student not found").build();
		} catch (Exception e) {

			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Failed to delete student").build();
		}
	}

	@Override
	public Student createStudent(Student student) throws Exception {
		try {
			

			long userId = student.getId();
			System.out.println(userId);

			if (Validator.isNull(userId)) {

				
				User newUser = userLocalService.addUser(contextUser.getUserId(), contextUser.getCompanyId(), true,
						StringPool.BLANK, StringPool.BLANK, true, StringPool.BLANK, student.getEmail(),
						contextAcceptLanguage.getPreferredLocale(), student.getFirstname(), StringPool.BLANK,
						student.getLastname(), GetterUtil.DEFAULT_LONG, GetterUtil.DEFAULT_LONG, true, 1, 1, 1991,
						StringPool.BLANK, GetterUtil.DEFAULT_INTEGER, GetterUtil.DEFAULT_LONG_VALUES,
						GetterUtil.DEFAULT_LONG_VALUES, GetterUtil.DEFAULT_LONG_VALUES, GetterUtil.DEFAULT_LONG_VALUES,
						false, new ServiceContext());

				

				student.setId(newUser.getUserId());

			} else {

				User existingUser = userLocalService.getUser(userId);

				existingUser.setFirstName(student.getFirstname());
				existingUser.setLastName(student.getLastname());
				existingUser.setEmailAddress(student.getEmail());

				User updatedUser = userLocalService.updateUser(existingUser);

				

				student.setId(updatedUser.getUserId());

			}

		} catch (Exception e) {
			_log.error(e.getMessage(), e);
		}

		
		
		return student;
	}

	@Override
	public Student getStudentById(Long id) throws Exception {
		User user = userLocalService.getUserById(id);

		if (user != null) {
			return mapUserToStudent(user);
		} else {
			throw new Exception("Student not found");
		}
	}

	public static final Log _log = LogFactoryUtil.getLog(StudentResourceImpl.class);
}