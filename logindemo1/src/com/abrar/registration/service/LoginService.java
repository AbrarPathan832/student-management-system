package com.abrar.registration.service;

import java.sql.SQLException;
import java.util.List;

import com.abrar.registartion.dto.StudentDTO;
import com.abrar.registration.dao.LoginDao;
import com.abrar.registration.dao.RegistrationDao;
import com.abrar.registration.dto.LoginStudent;
import com.abrar.registration.dto.Student;

public class LoginService {
	private LoginDao ldo = new LoginDao();
	private RegistrationDao dao = new RegistrationDao();

	/**
	 * @param loginstudent
	 * @return
	 * @throws SQLException
	 */
	public StudentDTO login(LoginStudent loginstudent) throws SQLException {
		StudentDTO studentDTO = new StudentDTO();
		
		//boolean isUserAvailable = ldo.login(loginstudent);
		String userName = ldo.login(loginstudent);
		studentDTO.setUserName(userName);
		//studentDTO.setUserAvailable(isUserAvailable);
		if (userName != null && userName != "") {
		//if(isUserAvailable) {
			List<Student> listOfStudents = dao.listStudent();
			studentDTO.setListOfStudents(listOfStudents);
		}
		return studentDTO;
	}

}
