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
//import model.Deck;
//import model.Card;

/**
 * Servlet implementation class WarServlet
 */
@WebServlet(
		description = "This servlet runs the game.", 
		urlPatterns = {"/WarServlet","/doPlay", "/doWar"})

public class WarServlet extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;
	private Player player1;
	private Player player2;
	private boolean warChallenge = true;
	private boolean warWinner = true;
       
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

	//////////Other Methods//////////

		//Start a session and create/get players & names//
		
		String url = null;
		if(player1 == null && player2 == null){
		
		
		String playerName1 = request.getParameter("player1");	
		String playerName2 = request.getParameter("player2");	
		
		//Our players are created
		this.player1 = new Player(playerName1);
		this.player2 = new Player(playerName2);
		
		
		//Deal our Deck
		deal();
		draw();
		discard();
		
	/////JSP MAPPING//////	
		
		//Is this War?
		if(warChallenge == true){
			url = "/fightWar.jsp";
			deal();
		}
		
		
		//We have a winner
		else if(warWinner == true){
			url = "/winner.jsp";
		}
		
		//Regular Battle/Start
		else{
			url = "/fightRegular.jsp";
			deal();
		}
		

		
		
	    //Remember to test here tomorrow to see whats passing in sessions***

		session.setAttribute("player1", this.player1.getPlayerName());
		session.setAttribute("player2", this.player2.getPlayerName());	
		
		
		//session.setAttribute("War!", warChallenge);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url); 
		dispatcher.forward(request, response); 
		
	}
		


		
		
			//Compare values of topcards

					//Decide winner from deal


					//remove top cards



					//add removed cards to value of playerScore if the player won the deal
			
					//else WAR!
			
					//war stuff here
			
					//add three cards then do deal else keep going, else game end
			
					//if no more cards, highest playerScore wins!
		
	


	}
	
	
////Other Methods Needed/////
	
	private void discard() {
		// TODO Auto-generated method stub
		
	}

	

	private void draw() {
		// TODO Auto-generated method stub
		
	}

	private void deal() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
