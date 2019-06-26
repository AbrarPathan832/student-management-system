package com.abrar.common.listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
	
	private String dbURL;
	private String user;
	private String password;
	static private Connection con;
	
	/**
	 * Default Constructor
	 */
	public DBConnectionManager() {
		// TODO Auto-generated constructor stub
	}

	public DBConnectionManager(String url, String u, String p) {
		this.dbURL = url;
		this.user = u;
		this.password = p;
		// create db connection now
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dbURL,user,password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;
	}

	public void closeConnection() {
		// close DB connection here
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
