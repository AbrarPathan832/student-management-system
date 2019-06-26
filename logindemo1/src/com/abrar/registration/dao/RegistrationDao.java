package com.abrar.registration.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.abrar.common.listeners.DBConnectionManager;
import com.abrar.registration.dto.Student;

public class RegistrationDao {
	String fullName;
	String address;
	String age;
	String qualification;
	String percentage;
	String email;
	String username;
	String password;
	Connection con;
	{
		con = DBConnectionManager.getConnection();
	}

	/**
	 * Default Constructor
	 */
	public RegistrationDao() {
	};

	public RegistrationDao(String fullName, String address, String age, String qualification, String percentage,
			String email, String username, String password) {
		this.fullName = fullName;
		this.address = address;
		this.age = age;
		this.qualification = qualification;
		this.percentage = percentage;
		this.email = email; // dual
		this.username = username;
		this.password = password;
	}

	public boolean insertStudent(Student student) throws SQLException {
		System.out.println("Start of insertStudent() of RegistrationDao");
		String sql = "INSERT INTO student_info (fullName, address, age, qualification, percentage, emailid, username,password) VALUES (?, ?, ?, ?, ?, ?, ?, ? )";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, student.getFullName());
		statement.setString(2, student.getAddress());
		statement.setString(3, student.getAge());
		statement.setString(4, student.getQualification());
		statement.setString(5, student.getPercentage());
		statement.setString(6, student.getEmail());
		statement.setString(7, student.getUsername());
		statement.setString(8, student.getPassword());

		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		System.out.println("End of insertStudent() of RegistrationDao");
		return rowInserted;
	}

	public boolean register(Student student) throws SQLException {
		System.out.println("Start of Register() of RegistrationDao");
		return insertStudent(student);
		// System.out.println("End of Register() of RegistrationDao");
	}

	public List<Student> listStudent() throws SQLException {
		List<Student> listStudent = new ArrayList<>();

		String sql = "SELECT * FROM student.Student_info";
		Statement statement = (Statement) con.createStatement();
		ResultSet resultSet = ((java.sql.Statement) statement).executeQuery(sql);

		while (resultSet.next()) {
			String fullName = resultSet.getString("fullName");
			String address = resultSet.getString("address");
			String age = resultSet.getString("age");
			String qualification = resultSet.getString("qualification");
			String percentage = resultSet.getString("percentage");
			String email = resultSet.getString("emailid");
			String username = resultSet.getString("username");
			String password = resultSet.getString("password");

			Student student = new Student(fullName, address, age, qualification, percentage, email, username, password);
			listStudent.add(student);
		}

		resultSet.close();
		return listStudent;
	}
	/*
	 * public boolean updateStudent(Student student) throws SQLException { String
	 * sql =
	 * "UPDATE Student_info SET fullName = ?, address = ?, age = ?, qualification = ?,percentage = ?, email = ?"
	 * ; sql += " WHERE fullname = ?"; connect();
	 * 
	 * PreparedStatement statement = con.prepareStatement(sql);
	 * statement.setString(1, student.getFullName()); statement.setString(2,
	 * student.getAddress()); statement.setString(3, student.getAge());
	 * statement.setString(4, student.getQualification()); statement.setString(5,
	 * student.getPercentage()); statement.setString(6, student.getEmail());
	 * 
	 * 
	 * boolean rowUpdated = statement.executeUpdate() > 0; statement.close(); return
	 * rowUpdated; } public Student getStudent(String fullName) throws SQLException
	 * { Student student = null; String sql =
	 * "SELECT * FROM student_info WHERE fullname = ?";
	 * 
	 * connect();
	 * 
	 * PreparedStatement statement = con.prepareStatement(sql);
	 * statement.setString(1, fullName);
	 * 
	 * ResultSet resultSet = statement.executeQuery();
	 * 
	 * if (resultSet.next()) { String fullname = resultSet.getString("fullName");
	 * String address = resultSet.getString("address"); String age =
	 * resultSet.getString("age"); String qualification =
	 * resultSet.getString("qualification"); String percentage =
	 * resultSet.getString("percentage"); String email =
	 * resultSet.getString("email"); student = new Student(fullName, address, age,
	 * qualification, percentage, email); }
	 * 
	 * resultSet.close(); statement.close();
	 * 
	 * return student; }
	 */

}
