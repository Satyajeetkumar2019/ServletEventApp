package com.nt.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import java.util.Date;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSession;
public class SessionDuractionListener  implements HttpSessionListener{
	//create variable here 
	private long start ;
	private long end ;
	private ServletContext sc;
	public void sessionCreated(HttpSessionEvent event) {
		start=System.currentTimeMillis();
		//wriet to log file
		sc=event.getSession().getServletContext();
		sc.log("Session start at time  "+new Date());
		
	}//end of the method 
	public void SessionDestroyed(ServletContextEvent sce) {
		end=System.currentTimeMillis();
		//write to log file 
		sc.log("Session ended at  :"+new Date());
		sc.log("Session Duraction at  :"+(end-start)+"ms");
	
	}//end of the method 
	
}//end of the class
