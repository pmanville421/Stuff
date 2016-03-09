package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GameNumber;
import model.MessageBean;

/**
 * Servlet implementation class GuessServlet
 */
@WebServlet("/doGuess")
public class GuessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// set initial variable values
		String url = "guess.jsp";
		MessageBean msg = new MessageBean();
		
		// retrieve session attributes
		HttpSession session = request.getSession();
		GameNumber target = (GameNumber) session.getAttribute("target");
		GameNumber minimum = (GameNumber) session.getAttribute("minimum");
		GameNumber maximum = (GameNumber) session.getAttribute("maximum");
		GameNumber guesses = (GameNumber) session.getAttribute("guesses");
		
		try{
		   // get the guess
			int guess = Integer.parseInt(request.getParameter("guess"));

		   // compare the guess with the target
			if(guess == target.getValue()) {
				// the guess is correct
				msg.setMessage("Congratulations, You got it in " + guesses.getValue() + " tries.");
				url = "correct.jsp";
			} else {
				// the guess is incorrect
				guesses.increment();
				if(guess < target.getValue()){
					// guess is low - higher
					msg.setMessage("Incorrect. Please guess higher");
				} else {
					// guess is high = lower
					msg.setMessage("Incorrect. Please guess lower");
				}
			}		
		} catch (NumberFormatException nfe){
			msg.setMessage("Please be sure to enter a number between " + minimum.getValue() + " and " + maximum.getValue());
		}
		
		// update session variables
		session.setAttribute("message", msg);
		session.setAttribute("guesses", guesses);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
