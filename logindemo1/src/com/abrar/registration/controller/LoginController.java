package com.abrar.registration.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abrar.registration.dto.LoginStudent;
import com.abrar.registration.dto.StudentDTO;
import com.abrar.registration.service.LoginService;

public class LoginController extends HttpServlet {
	LoginService loginservice = new LoginService();

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		LoginStudent l = new LoginStudent();
		l.setUsername(username);
		l.setPassword(password);
		StudentDTO studentDTO = null;
		try {
			studentDTO = loginservice.login(l);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (null != studentDTO && studentDTO.getUserName() != null && studentDTO.getUserName() != "" ) {
			req.setAttribute("listOfStudents", studentDTO.getListOfStudents());
			req.setAttribute("userName", studentDTO.getUserName());
			RequestDispatcher r = req.getRequestDispatcher("\\WEB-INF\\homepage.jsp");
			r.forward(req, res);
		} else {
			ServletConfig config = getServletConfig();
			String loginErrorMessage = config.getInitParameter("loginErrorMessage");
			RequestDispatcher r = req.getRequestDispatcher("LoginPage.jsp");
			System.out.println("loginErrorMessage::: "+ loginErrorMessage);
			req.setAttribute("loginErrorMessage", loginErrorMessage);
			r.forward(req, res);

		}
	}
}
