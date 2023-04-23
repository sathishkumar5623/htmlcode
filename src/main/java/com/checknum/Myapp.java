package com.checknum;


import java.io.IOException;                 
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myapp
 */
@WebServlet("/Myapp")
public class Myapp extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myapp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=null;
		response.setContentType("Text/html");
		try {
			pw=response.getWriter();
			int input=Integer.parseInt(request.getParameter("t"));
			if(input%2==0)
				pw.println("<h2>input number "+input+" is even number");
			else
				pw.println("<h2>input number "+input+" is odd number");
		}
		catch(Exception e) {
			pw.print( e.toString());
		}
		finally {
			pw.println("<br>");
			pw.println("<i style='text-align:center'><a heref=index.html>click here<to go back to hoe page</i>");
		}
			
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}





