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
		String sql = "SELECT * FROM student.student_db where userName = ? and password = ? ";
		PreparedStatement pstmt = con.prepareStatement(sql); // create a statement
		pstmt.setString(1, loginstudent.getUsername());
		pstmt.setString(2, loginstudent.getPassword());
		ResultSet rs = pstmt.executeQuery();
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
		
		
	}

}
