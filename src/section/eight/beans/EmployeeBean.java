package section.eight.beans;

import java.io.Serializable;

public class EmployeeBean implements Serializable {

	private String first, last, email;

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmployeeBean{" +
				"first='" + first + '\'' +
				", last='" + last + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
