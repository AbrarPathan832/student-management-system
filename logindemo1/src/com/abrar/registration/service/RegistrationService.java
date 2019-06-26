package com.abrar.registration.service;

import java.sql.SQLException;

import com.abrar.registration.dao.RegistrationDao;
import com.abrar.registration.dto.Student;

public class RegistrationService 
{	
	private RegistrationDao dao = new RegistrationDao();
	
	public boolean register(Student student) throws SQLException
	{
		return dao.register(student);
	}
}
