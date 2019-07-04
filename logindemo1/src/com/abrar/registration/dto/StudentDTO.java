package com.abrar.registartion.dto;

import java.util.List;

import com.abrar.registration.dto.Student;

public class StudentDTO 
{
	private boolean isUserAvailable;
	private List<Student> listOfStudents;
	
	private String userName;
	/**
	 * 
	 */
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param isUserAvailable
	 * @param listOfStudents
	 */
	public StudentDTO(boolean isUserAvailable, List<Student> listOfStudents) {
		super();
		this.isUserAvailable = isUserAvailable;
		this.listOfStudents = listOfStudents;
	}
	/**
	 * @return the isUserAvailable
	 */
	public boolean isUserAvailable() {
		return isUserAvailable;
	}
	/**
	 * @param isUserAvailable the isUserAvailable to set
	 */
	public void setUserAvailable(boolean isUserAvailable) {
		this.isUserAvailable = isUserAvailable;
	}
	/**
	 * @return the listOfStudents
	 */
	public List<Student> getListOfStudents() {
		return listOfStudents;
	}
	/**
	 * @param listOfStudents the listOfStudents to set
	 */
	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
