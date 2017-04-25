package com.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
/**
 * Servlet implementation class TestCon
 */
@WebServlet("/TestCon")
public class TestCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String jdbc = "jdbc:mysql://serwer1653992.home.pl";
		String user = "20585683_baza";
		String pass = "Trudnehaslo1";
		String driver = "com.mysql.jdbc.Driver";
		
		try{
			PrintWriter out = response.getWriter();
			
			out.println("Connection to database "+jdbc);
			
			Class.forName(driver);
			Connection myCon = 
					DriverManager.getConnection(jdbc,user,pass);
			
			out.println("Connected!");
			
			myCon.close();
		
		}catch(Exception ex){
			ex.printStackTrace();
			throw new ServletException(ex);
		}
		}

}
