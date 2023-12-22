package student.rest.client.serdes.v1_0;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

import student.rest.client.dto.v1_0.Student;
import student.rest.client.json.BaseJSONParser;

/**
 * @author rahul
 * @generated
 */
@Generated("")
public class StudentSerDes {

	public static Student toDTO(String json) {
		StudentJSONParser studentJSONParser = new StudentJSONParser();

		return studentJSONParser.parseToDTO(json);
	}

	public static Student[] toDTOs(String json) {
		StudentJSONParser studentJSONParser = new StudentJSONParser();

		return studentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Student student) {
		if (student == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (student.getEmail() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"email\": ");

			sb.append("\"");

			sb.append(_escape(student.getEmail()));

			sb.append("\"");
		}

		if (student.getFirstname() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"firstname\": ");

			sb.append("\"");

			sb.append(_escape(student.getFirstname()));

			sb.append("\"");
		}

		if (student.getGender() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"gender\": ");

			sb.append("\"");

			sb.append(_escape(student.getGender()));

			sb.append("\"");
		}

		if (student.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(student.getId());
		}

		if (student.getLastname() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"lastname\": ");

			sb.append("\"");

			sb.append(_escape(student.getLastname()));

			sb.append("\"");
		}

		if (student.getMobilenumber() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"mobilenumber\": ");

			sb.append("\"");

			sb.append(_escape(student.getMobilenumber()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		StudentJSONParser studentJSONParser = new StudentJSONParser();

		return studentJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Student student) {
		if (student == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (student.getEmail() == null) {
			map.put("email", null);
		}
		else {
			map.put("email", String.valueOf(student.getEmail()));
		}

		if (student.getFirstname() == null) {
			map.put("firstname", null);
		}
		else {
			map.put("firstname", String.valueOf(student.getFirstname()));
		}

		if (student.getGender() == null) {
			map.put("gender", null);
		}
		else {
			map.put("gender", String.valueOf(student.getGender()));
		}

		if (student.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(student.getId()));
		}

		if (student.getLastname() == null) {
			map.put("lastname", null);
		}
		else {
			map.put("lastname", String.valueOf(student.getLastname()));
		}

		if (student.getMobilenumber() == null) {
			map.put("mobilenumber", null);
		}
		else {
			map.put("mobilenumber", String.valueOf(student.getMobilenumber()));
		}

		return map;
	}

	public static class StudentJSONParser extends BaseJSONParser<Student> {

		@Override
		protected Student createDTO() {
			return new Student();
		}

		@Override
		protected Student[] createDTOArray(int size) {
			return new Student[size];
		}

		@Override
		protected void setField(
			Student student, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "email")) {
				if (jsonParserFieldValue != null) {
					student.setEmail((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "firstname")) {
				if (jsonParserFieldValue != null) {
					student.setFirstname((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "gender")) {
				if (jsonParserFieldValue != null) {
					student.setGender((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					student.setId(Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastname")) {
				if (jsonParserFieldValue != null) {
					student.setLastname((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "mobilenumber")) {
				if (jsonParserFieldValue != null) {
					student.setMobilenumber((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
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
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}