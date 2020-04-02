package com.javapapers.servlet.introduction;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloFormData extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Servlet: Read Form Data";
		out.println("<html>" + "<head><title>" + title
				+ "</title></head><body>"
				+ "<h1>" + title + "</h1>"
				+ "<p>Hi "
				+ request.getParameter("name")
				+ "</p>"
				+ "</body></html>");
	}
}