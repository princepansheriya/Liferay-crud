package student.rest.client.dto.v1_0;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

import student.rest.client.function.UnsafeSupplier;
import student.rest.client.serdes.v1_0.StudentSerDes;

/**
 * @author prince
 * @generated
 */
@Generated("")
public class Student implements Cloneable, Serializable {

	public static Student toDTO(String json) {
		return StudentSerDes.toDTO(json);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmail(
		UnsafeSupplier<String, Exception> emailUnsafeSupplier) {

		try {
			email = emailUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String email;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setFirstname(
		UnsafeSupplier<String, Exception> firstnameUnsafeSupplier) {

		try {
			firstname = firstnameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String firstname;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setGender(
		UnsafeSupplier<String, Exception> genderUnsafeSupplier) {

		try {
			gender = genderUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String gender;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long id;

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setLastname(
		UnsafeSupplier<String, Exception> lastnameUnsafeSupplier) {

		try {
			lastname = lastnameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String lastname;

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public void setMobilenumber(
		UnsafeSupplier<String, Exception> mobilenumberUnsafeSupplier) {

		try {
			mobilenumber = mobilenumberUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String mobilenumber;

	@Override
	public Student clone() throws CloneNotSupportedException {
		return (Student)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Student)) {
			return false;
		}

		Student student = (Student)object;

		return Objects.equals(toString(), student.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return StudentSerDes.toJSON(this);
	}

}