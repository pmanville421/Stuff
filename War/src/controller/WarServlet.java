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
	private Deck warDeckPlayer1;
	private Deck warDeckPlayer2;
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

	

		//START A SESSION AND GET PLAYER NAMES//
		
		String url = null;
		if(player1 == null && player2 == null){
		
			
		//Names from index.jsp
		String playerName1 = request.getParameter("player1");	
		String playerName2 = request.getParameter("player2");	
		
		
		
		//Our players are created
		this.player1 = new Player(playerName1);
		this.player2 = new Player(playerName2);
		startDeck = new Deck();
		dealDeck();
		
		}
		
	////*****JSP MAPPING & CONDITIONALS*****//////	
		
		
		//If war happens
		if(warStart){
				url = "/fightWar.jsp";
				playGame();
				session.setAttribute("warDeckPlayer1", warDeckPlayer1);
				session.setAttribute("warDeckPlayer2", warDeckPlayer2);
			}
		
		//fightRegular
		else{
			
			if(this.player1.isgameWinner() == true || this.player2.isgameWinner() == true){
				dealDeck();	
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
			playGame();
		}
		
	}
	    ////***SET SESSION VARIABLES FOR RESPONSE***////

			
	if(this.player1.isdealWinner()){
		session.setAttribute("winner", this.player1.getPlayerName());
	}else if(this.player2.isdealWinner()){
		session.setAttribute("winner", this.player2.getPlayerName());
	}
		session.setAttribute("player1", this.player1.getPlayerName());
		session.setAttribute("player2", this.player2.getPlayerName());
		session.setAttribute("player1TopCard", player1TopCard);
		session.setAttribute("player2TopCard", player2TopCard);
		session.setAttribute("playerScore1", this.player1.getPlayerScore());
		session.setAttribute("playerScore2", this.player2.getPlayerScore());
		session.setAttribute("player1CardsLeft", this.player1.gethand().getCardsLeft());
		session.setAttribute("player2CardsLeft", this.player2.gethand().getCardsLeft());
		session.setAttribute("warStart",warStart);

		
		
		
		
		//Dispatcher
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url); 
		dispatcher.forward(request, response);
	
			
	}
	
	
	
	
	
////***GAME PLAY METHODS NEEDED***/////
	
	
	//dealDeck method
	private void dealDeck() {
		// TODO Auto-generated method stub
		startDeck.stackDeck();
		while(startDeck.getCardsLeft() != 0){
			this.player1.addtoDeck(startDeck.removeCard(0));
			this.player2.addtoDeck(startDeck.removeCard(0));

		}
	}
	
	
	//Gameplay method
	//Regular 1st
	
	private void playGame(){
		if(warStart == false){
			
			player1TopCard = this.player1.gethand().removeCard(0);
			player2TopCard = this.player2.gethand().removeCard(0);
			
			//Player 1 wins deal (elseif) player 2 wins (else WAR!) 
			if(player1TopCard.getValue() > player2TopCard.getValue()){
				this.player1.setPlayerScore(this.player1.getPlayerScore() + 2);
				this.player1.gethand().addCard(player1TopCard);
				this.player1.gethand().addCard(player2TopCard);
				this.player1.setdealWinner(true);
			}else if
					(player2TopCard.getValue() > player1TopCard.getValue()){
					this.player2.setPlayerScore(this.player2.getPlayerScore() + 2);
					this.player2.gethand().addCard(player1TopCard);
					this.player2.gethand().addCard(player2TopCard);
					this.player2.setdealWinner(true);
				}
			else{
				if(player1TopCard.getValue() == player2TopCard.getValue()){
					warStart = true;
					this.player1.setdealWinner(false);
					this.player2.setdealWinner(false);
					
				}
			}
		
		}
		
		
		//We Have War
		else if(warStart){
			int cardsLeftPlayer1;
			int cardsLeftPlayer2;
			int warWinnings = 0;
			
			warDeckPlayer1 = new Deck();
			warDeckPlayer2 = new Deck();
			
			//Loop through whats left 
			for(int i = 0; i < 4; i++){
				cardsLeftPlayer1 = this.player1.gethand().getCardsLeft();
				cardsLeftPlayer2 = this.player1.gethand().getCardsLeft();
				if(cardsLeftPlayer1 == 0 || cardsLeftPlayer2 == 0)
				break;
				else{
					warWinnings++;
					warDeckPlayer1.addCard(this.player1.gethand().removeCard(0));
					warDeckPlayer2.addCard(this.player2.gethand().removeCard(0));
				}
				
			}
			//Test this real quick***
			System.out.println("Your Winnings!" +warWinnings);
			
			
			//Get winnings
			//Player 1
			if(warDeckPlayer1.getCard(warWinnings - 1).getValue() > warDeckPlayer2.getCard(warWinnings - 1).getValue()){
				this.player1.gethand().addCard(player1TopCard);
				for(int i = 0; i < warDeckPlayer1.getCardsLeft(); i++){
					this.player1.gethand().addCard(warDeckPlayer2.getCard(i));
				}
				this.player1.setPlayerScore(this.player1.getPlayerScore() + 10);
				this.player1.setdealWinner(true);

			}else if(warDeckPlayer2.getCard(warWinnings - 1).getValue() > warDeckPlayer1.getCard(warWinnings - 1).getValue()){
				this.player2.gethand().addCard(player2TopCard);
				for(int i = 0; i < warDeckPlayer1.getCardsLeft(); i++){
					this.player2.gethand().addCard(warDeckPlayer1.getCard(i));
				}
				this.player2.setPlayerScore(this.player2.getPlayerScore() + 10);
				this.player2.setdealWinner(true);
			}
		}
	}
}
