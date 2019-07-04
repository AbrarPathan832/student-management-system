package com.abrar.registration.service;

import java.sql.SQLException;
import java.util.List;

import com.abrar.registration.dao.RegistrationDao;
import com.abrar.registration.dao.UpdateDao;
import com.abrar.registration.dto.Student;
import com.abrar.registration.dto.StudentDTO;

/**
 * @author admin
 *
 */
public class RegistrationService 
{	
	private UpdateDao updateDao = new UpdateDao();
	private RegistrationDao dao = new RegistrationDao();
	
	/**
	 * @param student
	 * @return
	 * @throws SQLException
	 */
	public boolean register(Student student) throws SQLException
	{
		return dao.register(student);
	}
	
	public Student getStudentByStudentId(String studentId) throws SQLException
	{
		return updateDao.getStudentByStudentId(studentId);	
	}
	public StudentDTO delete(String studentId) throws SQLException
	{
		StudentDTO studentDTO = new StudentDTO();
		boolean isDeleted = dao.delete(studentId);
		
		List<Student> listOfStudents = dao.listStudent();
		studentDTO.setDeleted(isDeleted);
		studentDTO.setListOfStudents(listOfStudents);
		
		return studentDTO;
	}
}
