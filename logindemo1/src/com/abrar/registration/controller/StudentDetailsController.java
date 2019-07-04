package com.abrar.registration.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abrar.registration.dto.Student;
import com.abrar.registration.service.RegistrationService;

public class StudentDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    RegistrationService registrationService = new RegistrationService();
    public StudentDetailsController() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String studentId = request.getParameter("id");
		try {
			Student student = registrationService.getStudentByStudentId(studentId);
			request.setAttribute("student", student);
			RequestDispatcher rd = request.getRequestDispatcher("\\UpdateStudent.jsp");
			rd.forward(request, response);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("UpdateStudent");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
		
		response.setContentType("text/html");
		
		String id = request.getParameter("id");
		
	}

	
}

