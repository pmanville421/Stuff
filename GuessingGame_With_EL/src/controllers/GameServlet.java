package controllers;
//edited PLM
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
		description = "A servlet to control our simple guessing game", 
		urlPatterns = { 
				"/GameServlet", 
				"/doGuess"
		},
		initParams = {
				@WebInitParam(name = "guesses", value="1", description = "Initial Guess Number"),
				@WebInitParam(name = "minimum", value="0", description = "Minimum Range"),
				@WebInitParam(name = "maximum", value="1000", description = "Maximum Range")

			}
		)
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private GameNumber guesses;
	private int minimum;
	private int maximum;
	private GameNumber target;
	private MessageBean msg;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	
	
    public GameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    public void init(ServletConfig config)throws ServletException {
    	this.guesses = new GameNumber(Integer.parseInt(config.getInitParameter("guesses")));
    	this.minimum = Integer.parseInt(config.getInitParameter("minimum"));
    	this.maximum = Integer.parseInt(config.getInitParameter("maximum"));
    
    	target = new GameNumber();
    	target.setRandom(minimum, maximum);
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GameNumber guess = new GameNumber(Integer.parseInt(request.getParameter("guess")));
		
		//The Mapping

		Map<String, Double> guessTimates = new HashMap<>();		
		guessTimates.put("10", 2.5);
		guessTimates.put("50",  (double) 5);
		guessTimates.put("100", (double) 6);
		guessTimates.put("500", (double) 8);
		guessTimates.put("1000", (double) 9);
		guessTimates.put("5000", (double) 11);
		guessTimates.put("10000", (double) 12);

		
		HttpSession session = request.getSession();
		msg = (MessageBean)session.getAttribute("msg");
		session.setAttribute("guessTimates", guessTimates);
		
		

		// initialize output
		//String msg = "";
		String url = "/guess.jsp";
		
		
		// compare the guess with the target
	   if( guess.getValue() == target.getValue()){
		   // winner
		   msg.setCorrectGuessMsg("Correct! You got it in " + guesses.getValue() + " guesses."); 
		   url = "/correct.jsp";
		   init();
	   } else {
		   // next guess
		   this.guesses.increment();
		   session.setAttribute("guesses", guesses);
		   if ( guess.getValue() < target.getValue() ) {
			   //low
			   msg.setGuessMsg("Incorrect guess! Guess higher next time.");
		   } else {
			   // high
			   msg.setGuessMsg("Incorrect guess! Guess lower next time.");
		   }
		   
		   
	   }
	   
	   // add values to request object to pass to the destination
	   request.setAttribute("msg", msg);
	   //request.setAttribute("guesses", guesses);

	   System.out.println(target.getValue());
	   
	   session.setAttribute("target", target);
	   session.setAttribute("minimum", minimum);
	   session.setAttribute("maximum", maximum);
	   // send control to the next component
	   RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	   dispatcher.forward(request, response);
		
		
	}

}
