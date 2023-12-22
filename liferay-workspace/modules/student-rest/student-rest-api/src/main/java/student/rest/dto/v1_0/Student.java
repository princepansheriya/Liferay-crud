package student.rest.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author prince
 * @generated
 */
@Generated("")
@GraphQLName(description = "Student", value = "Student")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Student")
public class Student implements Serializable {

	public static Student toDTO(String json) {
		return ObjectMapperUtil.readValue(Student.class, json);
	}

	public static Student unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Student.class, json);
	}

	@Schema
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonIgnore
	public void setEmail(UnsafeSupplier<String, Exception> emailUnsafeSupplier) {

		try {
			email = emailUnsafeSupplier.get();
		} catch (RuntimeException re) {
			throw re;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String email;

	@Schema
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@JsonIgnore
	public void setFirstname(UnsafeSupplier<String, Exception> firstnameUnsafeSupplier) {

		try {
			firstname = firstnameUnsafeSupplier.get();
		} catch (RuntimeException re) {
			throw re;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String firstname;

	@Schema
	public @GraphQLField String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonIgnore
	public void setGender(UnsafeSupplier<String, Exception> genderUnsafeSupplier) {

		try {
			gender = genderUnsafeSupplier.get();
		} catch (RuntimeException re) {
			throw re;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String gender;

	@Schema
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		} catch (RuntimeException re) {
			throw re;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long id;

	@Schema
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@JsonIgnore
	public void setLastname(UnsafeSupplier<String, Exception> lastnameUnsafeSupplier) {

		try {
			lastname = lastnameUnsafeSupplier.get();
		} catch (RuntimeException re) {
			throw re;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String lastname;

	@Schema
	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@JsonIgnore
	public void setMobilenumber(UnsafeSupplier<String, Exception> mobilenumberUnsafeSupplier) {

		try {
			mobilenumber = mobilenumberUnsafeSupplier.get();
		} catch (RuntimeException re) {
			throw re;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String mobilenumber;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Student)) {
			return false;
		}

		Student student = (Student) object;

		return Objects.equals(toString(), student.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (email != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"email\": ");

			sb.append("\"");

			sb.append(_escape(email));

			sb.append("\"");
		}

		if (firstname != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"firstname\": ");

			sb.append("\"");

			sb.append(_escape(firstname));

			sb.append("\"");
		}

		if (gender != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"gender\": ");

			sb.append("\"");

			sb.append(_escape(gender));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (lastname != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"lastname\": ");

			sb.append("\"");

			sb.append(_escape(lastname));

			sb.append("\"");
		}

		if (mobilenumber != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"mobilenumber\": ");

			sb.append("\"");

			sb.append(_escape(mobilenumber));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(accessMode = Schema.AccessMode.READ_ONLY, defaultValue = "student.rest.dto.v1_0.Student", name = "x-class-name")
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(String.valueOf(object), _JSON_ESCAPE_STRINGS[0], _JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[]) value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					} else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			} else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>) value));
			} else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			} else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = { { "\\", "\"", "\b", "\f", "\n", "\r", "\t" },
			{ "\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t" } };

}