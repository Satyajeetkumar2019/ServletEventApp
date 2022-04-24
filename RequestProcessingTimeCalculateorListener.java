package com.nt.Servlet;

import java.io.IOException;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RequestProcessingTimeCalculateorListener extends HttpServlet {
	//create variable 
	private int start;
	private int end ;
	public void requestInitialized(ServletRequestEvent sre) {
		start=(int) System.currentTimeMillis();
		
	}//end method 
	public void requestDestroyed(ServletRequestEvent sre) {
		end=(int) System.currentTimeMillis();
		//write reqprocessing time to log file 
		ServletContext sc=sre.getServletContext();
		sc.log(((HttpServletRequest)sre.getServletRequest()).getRequestURL()+"hAS TAKE "+(end-start)+"ms");
	}//end of the method 
	
}//end of the class
