package student.rest.internal.graphql.mutation.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.batch.engine.resource.VulcanBatchEngineImportTaskResource;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

import student.rest.dto.v1_0.Student;
import student.rest.resource.v1_0.StudentResource;

/**
 * @author rahul
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setStudentResourceComponentServiceObjects(
		ComponentServiceObjects<StudentResource>
			studentResourceComponentServiceObjects) {

		_studentResourceComponentServiceObjects =
			studentResourceComponentServiceObjects;
	}

	@GraphQLField
	public Student createStudent(@GraphQLName("student") Student student)
		throws Exception {

		return _applyComponentServiceObjects(
			_studentResourceComponentServiceObjects,
			this::_populateResourceContext,
			studentResource -> studentResource.createStudent(student));
	}

	@GraphQLField
	public Response deleteStudentById(@GraphQLName("id") Long id)
		throws Exception {

		return _applyComponentServiceObjects(
			_studentResourceComponentServiceObjects,
			this::_populateResourceContext,
			studentResource -> studentResource.deleteStudentById(id));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(StudentResource studentResource)
		throws Exception {

		studentResource.setContextAcceptLanguage(_acceptLanguage);
		studentResource.setContextCompany(_company);
		studentResource.setContextHttpServletRequest(_httpServletRequest);
		studentResource.setContextHttpServletResponse(_httpServletResponse);
		studentResource.setContextUriInfo(_uriInfo);
		studentResource.setContextUser(_user);
		studentResource.setGroupLocalService(_groupLocalService);
		studentResource.setRoleLocalService(_roleLocalService);

		studentResource.setVulcanBatchEngineImportTaskResource(
			_vulcanBatchEngineImportTaskResource);
	}

	private static ComponentServiceObjects<StudentResource>
		_studentResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;
	private VulcanBatchEngineImportTaskResource
		_vulcanBatchEngineImportTaskResource;

}