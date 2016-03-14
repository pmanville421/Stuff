package controller;

import java.io.IOException;
import java.io.Serializable;
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
@WebServlet
("/doPlay") 

public class WarServlet extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;
       
	public Player p1 = null;
	public Player p2 = null;
    public Deck hand; 
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
	
	if(p1 == null && p2 == null){
		
		String p1Name = request.getParameter("player1");
		String p2Name = request.getParameter("player2");
		this.p1 = new Player(p1Name, 0, hand);
		this.p1 = new Player(p2Name, 0, hand);

		}

	}

}
