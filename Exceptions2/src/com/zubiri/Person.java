package com.zubiri;

public class Person {

	private int age = 0;

	private String birtYear = "";

	private String city = "";

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {

		try {

			checkAge(age);
			this.age = age;
		} catch (Exception e) {
			throw e;
		}
	}

	public String getBirthYear() {
		return birtYear;
	}

	public void setBirthYear(String birthYear) throws Exception {

		try {
			checkBirthYear(birthYear);
			this.birtYear = birthYear;

		} catch (Exception e) {

			throw e;

		}
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) throws Exception {

		try {
			checkCity(city);
			this.city = city;

		} catch (Exception e) {

			throw e;

		}
		this.city = city;
	}

	public void checkAge(int age) throws Exception {

		if (age < 0 || age > 100) {

			throw new Exception("age is not valid");

		}

	}

	public void checkBirthYear(String year) throws Exception {

		if (year.matches("^[0-9]") || Integer.parseInt(year) < 1900)

			throw new Exception("year is not valid");

	}

	public void checkCity(String city) throws Exception {

		if (!city.matches("[a-zA-Z]+"))

			throw new Exception("City is not valid");

	}
	

}
