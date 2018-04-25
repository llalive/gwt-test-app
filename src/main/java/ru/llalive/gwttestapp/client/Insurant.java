package ru.llalive.gwttestapp.client;

import java.util.Date;

public class Insurant {

	private String firstName;
	private String patronymic;
	private String lastName;
	private Date dateOfBirth;
	private Passport passport;

	class Passport {

		private String serial;
		private String number;

		public Passport(String serial, String number) {
			this.serial = serial;
			this.number = number;
		}

		@Override
		public String toString() {
			return serial + " " + number;
		}
	}

	public Insurant() {
	}

	public Insurant(String fullName) {
		String[] s = fullName.split(" ");
		if (s.length == 3) {
			this.firstName = s[0];
			this.patronymic = s[1];
			this.lastName = s[2];
		}
	}

	@Override
	public String toString() {
		return firstName + " " + patronymic + " " + lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
}