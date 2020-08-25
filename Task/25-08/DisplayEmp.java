package com.mysrv.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayEmp
 */
@WebServlet("/DisplayEmp")
public class DisplayEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String name=request.getParameter("Name");
		out.print("<br>"+name+"<br>");
		String eid=request.getParameter("EmployeeID");
		out.print(eid+"<br>");
		String address=request.getParameter("Address");
		out.print(address+"<br>");
		String pswd=request.getParameter("Password");
		out.print(pswd+"<br>");
		String cpswd=request.getParameter("confirmPassword");
		out.print(cpswd+"<br>");
		String gender=request.getParameter("Gender");
		out.print(gender+"<br>");
		String arr[]= request.getParameterValues("languagesKnown");
	    for(String a:arr){
	    out.println(a+"<br>");
	    }
		String dob=request.getParameter("DOB");
		out.print(dob+"<br>");
		String squest=request.getParameter("SecurityQuestion");
		out.print(squest+"<br>");
		String sans=request.getParameter("SecurityAnswer");
		out.print(sans+"<br>");
		
	}

}
