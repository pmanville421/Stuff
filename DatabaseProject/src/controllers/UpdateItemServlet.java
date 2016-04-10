package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.UpdateQuery;
import model.Item;

/**
 * Servlet implementation class UpdateItemServlet
 */
@WebServlet(
		description = "Controller which starts actual item to update the database", 
		urlPatterns = { 
				"/UpdateItemServlet", 
				"/updateItem"
		})
public class UpdateItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateItemServlet() {
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
		
		//get the form data and setup item object
		String sku = request.getParameter("sku");
		String productType = request.getParameter("productType");
		String flavor = request.getParameter("flavor");
		Double cost = Double.parseDouble(request.getParameter("cost"));
		Double price = Double.parseDouble(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		Item item = new Item();
		item.setSku(sku);
		item.setProductType(productType);
		item.setFlavor(flavor);
		item.setCost(cost);
		item.setPrice(price);
		item.setQuantity(quantity);
		
		
		//create an update query object that will be used to update book
		UpdateQuery uq = new UpdateQuery("grocery", "root", "wolf");
		uq.doUpdate(item);
		
		//pass control to ReadServlet
		String url = "/read";
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
