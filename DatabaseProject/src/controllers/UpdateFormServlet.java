package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.ReadRecord;
import model.Item;

/**
 * Servlet implementation class UpdateFormServlet
 */
@WebServlet(
		description = "This will get the item and use the data to fill in a table for updating a record", 
		urlPatterns = {"/update"})
public class UpdateFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//get the sku
		String sku = request.getParameter("sku");
		
		
		//create ReadRecord
		ReadRecord rr = new ReadRecord("grocery", "root", "wolf", sku);
		
		
		//Use ReadRecord to get the item data
		rr.doRead();
		
		Item item = rr.getItem();
		
		//pass item and control to the updateForm.jsp
		request.setAttribute("item", item);
		
		String url = "/updateForm.jsp";
		
		//Standard dispatcher		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
