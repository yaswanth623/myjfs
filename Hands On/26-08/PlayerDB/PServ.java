package com.myplayer.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.myplayer.dao.PlayerDao;
import com.myplayer.model.Player;




@WebServlet("/PServ")
public class PServ extends HttpServlet{


@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out=response.getWriter();
response.setContentType("text/html");

out.print("servlet 1");

String fName= request.getParameter("playerFName");
String lName= request.getParameter("playerLName");
String DOB= request.getParameter("dob");
String place= request.getParameter("HomeTown");
String team= request.getParameter("team");

SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
Date dob=null;
try
{
dob=sdf.parse(DOB);
}
catch (Exception e) {
e.printStackTrace();
}

Player player=new Player(fName, lName, dob, place, team);

PlayerDao dao=new PlayerDao();
out.print(dao.createPlayer(player));



}

}
