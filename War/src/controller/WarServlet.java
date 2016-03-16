package controller;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Player;
import model.Deck;
import model.Card;
import model.PlayWar;

/**
 * Servlet implementation class WarServlet
 */
@WebServlet
("/doPlay") 

public class WarServlet extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;
       
	public Player player1 = null;
	public Player player2 = null;
    public Deck deck; 
	public boolean start = false;

	
	
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
	
	//Session start
	
	HttpSession session = request.getSession();

	String url = null;
	
	if(player1 == null && player2 == null){
		
		String player1Name = request.getParameter("player1");
		String player2Name = request.getParameter("player2");
		deck = new Deck();
		playGame();
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url); 
		dispatcher.forward(request, response);
		}

	}


	private void playGame() {
		// TODO Auto-generated method stub
		
	}

}
