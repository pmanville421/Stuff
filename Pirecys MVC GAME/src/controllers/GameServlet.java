package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GameNumber;
import model.MessageBean;

/**
 * Servlet implementation class GameServlet
 */
@WebServlet(
		description = "starts the guessing game", 
		urlPatterns = { "/index.html" }, 
		initParams = { 
				@WebInitParam(name = "minimum", value = "0", description = "sets the minimum range"), 
				@WebInitParam(name = "maximum", value = "1000", description = "sets the maximum of the guess range"), 
				@WebInitParam(name = "guesses", value = "1", description = "sets the number of guesses")
		})
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int minimum;
	private int maximum;
	private int guesses;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		this.minimum = Integer.parseInt(config.getInitParameter("minimum"));
		this.maximum = Integer.parseInt(config.getInitParameter("maximum"));
		this.guesses = Integer.parseInt(config.getInitParameter("guesses"));
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
		// set session attributes
		HttpSession session = request.getSession();
		session.setAttribute("minimum", new GameNumber(this.minimum));
		session.setAttribute("maximum", new GameNumber(this.maximum));
		session.setAttribute("guesses", new GameNumber(this.guesses));
		
		// use GameNumber to get a random target
		GameNumber target = new GameNumber();
		target.setRandom(this.minimum, this.maximum);
		session.setAttribute("target", target);
		
		// to test/debug
		System.out.println(target.getValue());
		
		// set the message
		MessageBean msg = new MessageBean("Please guess a number between " + this.minimum + " and " + this.maximum);
		session.setAttribute("message", msg);
		
		String url = "guess.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
