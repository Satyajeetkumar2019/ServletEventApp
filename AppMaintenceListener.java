package com.nt.Servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class AppMaintenceListener extends HttpServlet implements ServletContextListener {
	//create variable 
	private ServletContext sc;
	public void contextInitialized(ServletContextEvent event) {
		//wriet to log file
		sc=event.getServletContext();
		sc.log("Web Application is deployed related date "+new Date());
		
	}//end of the method 
	
	public void contextDestroyed(ServletContextEvent sce) {
		//write to log file 
		sc.log("Web Application IS stope here :"+new Date());
	
	}//end of the method 
	
}//end of the class
