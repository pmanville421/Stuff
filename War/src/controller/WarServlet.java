package controller;

import java.io.IOException;
import java.io.Serializable;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WarServlet
 */
@WebServlet("/doPlay")
public class WarServlet extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;
       
	public Player p1 = null;
   
    public WarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
