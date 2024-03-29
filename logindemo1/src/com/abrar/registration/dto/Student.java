package com.abrar.registration.dto;

public class Student 
{
	private String fullName;
	private String address;
	private String age;
	private String qualification;
	private String percentage;
	private String email;
	private String username;
	private String password;
	
	public Student() {
    }
 
    public Student(String fullname) {
        this.fullName = fullname;
    }
 
    
	/**
	 * @param fullName
	 * @param address
	 * @param age
	 * @param qualification
	 * @param percentage
	 * @param email
	 */
	public Student(String fullName, String address, String age, String qualification, String percentage,
			String email,String username,String password) {
		super();
		this.fullName = fullName;
		this.address = address;
		this.age = age;
		this.qualification = qualification;
		this.percentage = percentage;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
