package com.abrar.registration.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abrar.registration.dto.Student;
import com.abrar.registration.dto.StudentDTO;
import com.abrar.registration.service.RegistrationService;

public class RegistrationController extends HttpServlet
{	
	
	RegistrationService registrationService = new RegistrationService();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
	response.setContentType("text/html");
	Student s = new Student();
	
	String id = request.getParameter("id");
	String name = request.getParameter("fullname");
	String address = request.getParameter("address");
	String age = request.getParameter("age");
	String qualify = request.getParameter("qualification");
	String percentage = request.getParameter("percentage");
	String email = request.getParameter("emailid");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String flag = request.getParameter("flag"); 
	boolean update = Boolean.valueOf(flag);
	s.setId(id);
	s.setFlag(update);
	s.setFullName(name);
	s.setAddress(address);
	s.setAge(age);
	s.setQualification(qualify);
	s.setPercentage(percentage);
	s.setEmail(email);
	s.setUsername(username);
	s.setPassword(password);
	
	
	try {
		boolean isRegistered = registrationService.register(s);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ServletConfig configer = getServletConfig();
	String emailsent = configer.getInitParameter("emailsent");
	request.setAttribute("adminEmail",emailsent);
	RequestDispatcher rd = request.getRequestDispatcher("\\WEB-INF\\Login.jsp");
	rd.forward(request, response);
	
	 

}
}