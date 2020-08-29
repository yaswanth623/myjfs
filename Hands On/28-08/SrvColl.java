package com.mysrv.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SrvColl")
public class SrvColl extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String playerNames="rohit,rahul,virat,dk,hardik,kedar";

		HttpSession session= request.getSession();
		session.setAttribute("playerList", playerNames);

		RequestDispatcher rd= request.getRequestDispatcher("JSTLDemo.jsp");
		rd.forward(request, response);
	
	}


}