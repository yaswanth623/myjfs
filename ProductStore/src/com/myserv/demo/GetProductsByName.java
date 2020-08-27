package com.myserv.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myserv.dao.ProductDao;
import com.myserv.model.Product;


@WebServlet("/GetProductsByName")
public class GetProductsByName extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


ProductDao dao=new ProductDao();

String prodName=request.getParameter("pname");
ArrayList<Product> productList=  dao.getProductByName(prodName);

HttpSession session= request.getSession();
session.setAttribute("productList", productList);


RequestDispatcher rd= request.getRequestDispatcher("displayProduct.jsp");
rd.forward(request, response);

}


}