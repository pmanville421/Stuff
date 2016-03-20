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

import model.Card;
import model.Deck;
import model.Player;


/**
 * Servlet implementation class WarServlet
 */
@WebServlet(urlPatterns = {"/WarServlet","/doPlay", "/doWar"})

public class WarServlet extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;
	private Player player1;
	private Player player2;
	private Deck startDeck;
	private Card player1TopCard;
	private Card player2TopCard;
	private Deck warCardsPlayer1;
	private Deck warCardsPlayer2;
	private boolean warStart = false;
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException{ 

	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		HttpSession session = request.getSession();

	

		//Start a session and create/get players & names//
		
		String url = null;
		if(player1 == null && player2 == null){
		
		
		String playerName1 = request.getParameter("player1");	
		String playerName2 = request.getParameter("player2");	
		
		//Our players are created
		this.player1 = new Player(playerName1);
		this.player2 = new Player(playerName2);
		startDeck = new Deck();
		dealDeck();
		
		
		
	////*****JSP MAPPING and Conditionals*****//////	
		
		if(this.player1.isgameWinner() == true || this.player2.isgameWinner() == true){
			dealDeck();
		}
		
		
			if(warStart  == true){
				url = "/fightWar.jsp";
				session.setAttribute("warCardsPlayer1", warCardsPlayer1);
				session.setAttribute("warCardsPlayer2", warCardsPlayer2);
				
			}
		
			//If player 1 wins
			if(this.player2.gethand().getCardsLeft() == 0){
					this.player1.setgameWinner(true);
					url ="/winner.jsp";
					session.setAttribute("winner", this.player1.getPlayerName());
			}
			
			//player 2 wins
			else if(this.player1.gethand().getCardsLeft() == 0){
				this.player2.setgameWinner(true);
				url ="/winner.jsp";
				session.setAttribute("winner", this.player2.getPlayerName());
			}
			
		
		//Regular Battle/Start
		else{
			url = "/fightRegular.jsp";
			
		}
		

	    //Remember to test here tomorrow to see whats passing in sessions***

		session.setAttribute("player1", this.player1.getPlayerName());
		session.setAttribute("player2", this.player2.getPlayerName());
		session.setAttribute("player1TopCard", player1TopCard);
		session.setAttribute("player2TopCard", player2TopCard);
		session.setAttribute("playerScore1", this.player1.getPlayerScore());
		session.setAttribute("playerScore2", this.player2.getPlayerScore());
		session.setAttribute("player1CardsLeft", this.player1.gethand().getCardsLeft());
		session.setAttribute("player2CardsLeft", this.player2.gethand().getCardsLeft());

		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url); 
		dispatcher.forward(request, response);
	
		}

	}
	
	
////Other Methods Needed/////
	
	
	//Deal method
	private void dealDeck() {
		// TODO Auto-generated method stub
		startDeck.stackDeck();
		while(startDeck.getCardsLeft() != 0){
			this.player1.addtoDeck(startDeck.removeCard(0));
			this.player2.addtoDeck(startDeck.removeCard(0));

		}
	}
	
}
