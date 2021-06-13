package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendcookie")
public class sendcookie extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		
		Cookie c1=new Cookie("userName",name);
		Cookie c2=new Cookie("usePass",password);
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		out.println("<br><a href='receivecookie'>View Cookie</a>");
		out.close();
		
	}
  
}
