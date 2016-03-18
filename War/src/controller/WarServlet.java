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

/**
 * Servlet implementation class WarServlet
 */
@WebServlet(
		description = "This servlet runs the game.", 
		urlPatterns = { 
				"/WarServlet", 
				"/doPlay", 
				"/dofightRegular",
				"/doWar"
		})
public class WarServlet extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;
	private Player player1;
	private Player player2;
	private Deck playerDeck;
       
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		HttpSession session = request.getSession();

	//////////Other Methods//////////

		//Start a session and create/get players & names//
		
		String url = "index.jsp";
		if(player1 == null && player2 == null){
			
		String playerName1 = request.getParameter("player1");	
		String playerName2 = request.getParameter("player2");	
		
		
		this.player1 = new Player(playerName1);
		this.player2 = new Player(playerName2);
		
		
		//Deal Deck to players and create their decks//

		


		// setting our attributes to be sent back to next fightWar JSP// 
		
		url = "/fightRegular.jsp";
		session.setAttribute("playerName1", this.player1.getPlayerName());
		session.setAttribute("playerName2", this.player2.getPlayerName());
		//session.setAttribute("playerScore2", this.player1.getPlayerScore());
		//session.setAttribute("playerScore2", this.player2.getPlayerScore());

		
		
	    //Remember to test here tomorrow to see whats passing***
		
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


	
	
}
