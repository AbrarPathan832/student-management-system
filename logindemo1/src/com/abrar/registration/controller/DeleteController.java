package com.abrar.registration.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abrar.registration.dto.StudentDTO;
import com.abrar.registration.service.RegistrationService;

/**
 * Servlet implementation class DeleteController
 */
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	RegistrationService registrationService = new RegistrationService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String studentId = request.getParameter("id");
		try {
			StudentDTO studentDTO = registrationService.delete(studentId);
			if(studentDTO.isDeleted()) {
				request.setAttribute("deleteMsg", "Student deleted successfully.!");
				
			}else {
				request.setAttribute("errorMsg", "Internal Server occured. Please try again later");
			}
			System.out.println(studentDTO.getListOfStudents().size());
			request.setAttribute("listOfStudents", studentDTO.getListOfStudents());
			RequestDispatcher rd = request.getRequestDispatcher("\\WEB-INF\\homepage.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
