package com.abrar.registration.dto;

import java.util.List;

public class StudentDTO 
{
	private boolean isUserAvailable;
	private List<Student> listOfStudents;
	
	private boolean isDeleted;
	
	private String userName;
	/**
	 * 
	 */
	
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @return the isDeleted
	 */
	public boolean isDeleted() {
		return isDeleted;
	}


	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
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
