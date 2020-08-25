package com.mysrv.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		
		String data=request.getParameter("un");
		response.setContentType("text/html");
		out.print("<h1><font color='green'>Hello "+data+"</font></h1>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		
		String data=request.getParameter("un");
		response.setContentType("text/html");
		out.print("<h1><font color='green'>Hello "+data+"</font></h1>");
		
		String arr[]= request.getParameterValues("languagesKnown");
		   
	    for(String a:arr)
	    {
	   
	    out.println(a+"<br>");
	    }
		
	}

}
