package controllers;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import at.Amortization;
import at.Loan;

/**
 * Servlet implementation class AmortServlet
 */
@WebServlet(description = "A servlet that acts as a controller for the Amortization Classes", urlPatterns = { "/doAmortization" })
public class AmortServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AmortServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//get the input values from the request 
		//convert or setup input for processing
		//determine results
		
		
		double principal = Double.parseDouble(request.getParameter("Principal"));
		int term = Integer.parseInt(request.getParameter("Term"));
		double rate = Double.parseDouble(request.getParameter("Rate"));
		
		//generating the view
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		String url ="/doAmortization.jsp";
		
		
		request.setAttribute("amortized", new Amortization(new Loan(principal,rate,term)));
    	
    	getServletContext().getRequestDispatcher(url).forward(request, response);
		
		new Amortization(new Loan(principal,rate,term)).doAmortization();

		
		

	}

}
