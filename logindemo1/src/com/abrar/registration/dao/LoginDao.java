package com.abrar.registration.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.abrar.common.listeners.DBConnectionManager;
import com.abrar.registration.dto.LoginStudent;
import com.abrar.registration.dto.Student;

public class LoginDao {

	Connection con = DBConnectionManager.getConnection();
	RegistrationDao dao = new RegistrationDao();

	public String getUser(LoginStudent loginstudent) throws SQLException {
		String sql = "SELECT * FROM student.student_info where userName = ? and password = ? ";
		PreparedStatement pstmt = con.prepareStatement(sql); // create a statement
		pstmt.setString(1, loginstudent.getUsername());
		pstmt.setString(2, loginstudent.getPassword());
		ResultSet rs = pstmt.executeQuery();
		//String isUserAvailable = (rs.next() == true) ? true : false;
		String username = "";
		while (rs.next())
		{
			username = rs.getString("userName");
		}
		System.out.println("userName" + username);
		rs.close();
		pstmt.close();
		return username;
	}
	
	public String login(LoginStudent loginstudent) throws SQLException {
		return getUser(loginstudent);
		
		/*
		 * for (Student student : dao.listStudent()) {
		 * System.out.println("loginstudent Email:::: " + loginstudent.getUsername());
		 * System.out.println("loginstudent Password :::: " +
		 * loginstudent.getPassword()); if
		 * (student.getEmail().equals(loginstudent.getUsername()) &
		 * student.getPassword().equals(loginstudent.getPassword())) { return true; } }
		 * return false;
		 */
	}

}
