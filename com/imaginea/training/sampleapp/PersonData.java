package com.imaginea.training.sampleapp;

import java.util.Date;

public class PersonData {
	private String phone;
	private String email;
	private String username;
	private String firstName;
	private String lastName;
	private Gender gender;
	private Date dateOfBirth;

	public boolean isUserNameMatchingTo(final String username) {
		return username.equals(this.username);
	}

	public PersonData(String phone, String email, String username, String firstName, String lastName, Gender gender,
			Date dateOfBirth) {
		super();
		this.phone = phone;
		this.email = email;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	public String name() {
		return firstName + " " + lastName;
	}

	public String getEmail() {
		return email;
	}

	public boolean isEmailEqualTo(final String email) {
		if (this.email == null)
			return false;

		return this.email.equalsIgnoreCase(email);
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "PersonalInfo [phone=" + phone + ", email=" + email + ", username=" + username + ", firstName="
				+ firstName + ", lastName=" + lastName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	

}
