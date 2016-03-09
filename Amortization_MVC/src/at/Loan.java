/**
 * 
 */
package at;

/**
 * @author plm12
 *
 */
public class Loan {

	//declared variables
	
	private double Principal;
	
	private double Rate;
	
	private int Term;

	/**
	 * 
	 */
	
	//constructors
	
	public Loan() {
		this.Principal = 0;
		this.Rate = 0;
		this.Term = 0;
	}

	/**
	 * @param Principal
	 * @param Rate
	 * @param Term
	 */
	public Loan(double Principal, double Rate, int Term) {
		this.Principal = Principal;
		this.Rate = Rate;
		this.Term = Term;
	}

	/**
	 * @return the Principal
	 */
	public double getPrincipal() {
		return this.Principal;
	}

	/**
	 * @param Principal the Principal to set
	 */
	public void setPrincipal(double Principal) {
		this.Principal = Principal;
	}

	/**
	 * @return the Rate
	 */
	public double getRate() {
		return this.Rate;
	}

	/**
	 * @param Rate the Rate to set
	 */
	public void setRate(double Rate) {
		this.Rate = Rate;
	}

	/**
	 * @return the Term
	 */
	public int getTerm() {
		return this.Term;
	}

	/**
	 * @param Term the Term to set
	 */
	public void setTerm(int Term) {
		this.Term = Term;
	}
	
	
	
	//other needed methods
	
	public double getmonthlyRate(){
		double monthlyRate = (this.Rate / 100)/12;
		return monthlyRate;
	}
	
	public int gettotalTerms(){
		int totalTerms = (this.Term * 12);
		return totalTerms;
	}
	
	public double getmonthlyPayment() {
		double monthlyPayment = (this.getPrincipal() * this.getmonthlyRate()) / (1 - (Math.pow(1 + this.getmonthlyRate(), (-1 * this.gettotalTerms()))));
		return monthlyPayment;
		
	}
	
	
}
