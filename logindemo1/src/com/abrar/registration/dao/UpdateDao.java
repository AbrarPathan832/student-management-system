package com.abrar.registration.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.abrar.common.listeners.DBConnectionManager;
import com.abrar.registration.dto.Student;
import com.mysql.jdbc.Connection;

public class UpdateDao {
	
	RegistrationDao registrationDao = new RegistrationDao();
	
	public Student getStudentByStudentId(String studentId) throws SQLException {
		System.out.println("studentDB query entry");
		Connection conn = (Connection) DBConnectionManager.getConnection();
		String sql = "SELECT * FROM student.student_db where id = ? ";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, Integer.valueOf(studentId));
			
		ResultSet resultSet = statement.executeQuery();
		Student student = null;
		while (resultSet.next()) {
			student = registrationDao.getStudent(resultSet);
		}
		resultSet.close();
		
		return student;
		
	}
}

