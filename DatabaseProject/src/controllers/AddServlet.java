package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddQuery;
import model.Item;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet(
		description = "Controller for adding an item to products", 
		urlPatterns = { 
				"/AddServlet", 
				"/addItem"
		})
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//get the data
		String sku = request.getParameter("sku");
		String productType = request.getParameter("productType");
		String flavor = request.getParameter("flavor");
		Double cost = Double.parseDouble(request.getParameter("cost"));
		Double price = Double.parseDouble(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));

		
		//set up the item object
		Item item = new Item();
			item.setSku(sku);
			item.setProductType(productType);
			item.setFlavor(flavor);
			item.setCost(cost);
			item.setPrice(price);
			item.setQuantity(quantity);
		
		//set up an addQuery object
		AddQuery aq = new AddQuery("grocery", "root", "wolf");
		
		
		//pass the book to addQuery to add to the database
		aq.doAdd(item);
		
		
		//pass execution control to the ReadServlet
		String url = "/read";
	
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
