package com.mysrv.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Srv2")
public class Srv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Srv2() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session= request.getSession();
		String data=session.getAttribute("sVar").toString();
		
		ServletContext context= request.getServletContext();
		String appData= context.getAttribute("appVar").toString();
		
		out.print("servlet 2");
		out.print("Session data "+data);
		out.print("<br>");
		out.print("Application data "+appData);
		/*out.print("<form action='Srv3'>");
		out.print(" <input type='submit'>");
		out.print(" </form>");*/
	}

}
