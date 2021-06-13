package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/receivecookie")
public class receivecookie extends HttpServlet {
     protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
     {
    	 response.setContentType("text/html");
    	 PrintWriter out=response.getWriter();
    	 Cookie c[]=request.getCookies();
    	 out.print("Nmae: "+ c[1].getValue());
    	 out.print("Password:" + c[2].getValue());
    	 out.close();
     }
}
