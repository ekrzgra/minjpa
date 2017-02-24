package minjpa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InitDb")
public class InitDbServlet extends HttpServlet {

	private static final long serialVersionUID = -707852858734710563L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1>Init DB!</h1>");
		Persistence.createEntityManagerFactory("minjpaPU");
	}
}
