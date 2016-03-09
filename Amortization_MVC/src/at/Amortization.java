/**
 * 
 */
package at;

/**
 * @author plm12
 *
 */

//variables

import java.text.NumberFormat;

public class Amortization {

	private Loan loan;
	
	private double monthlyPayToInt;
	
	private double monthlyPayToBal;
	
	private double currentBal;

	/**
	 * @param loan
	 */
	public Amortization() {
		this.loan = new Loan();
	}

	/**
	 * @param loan
	 */
	public Amortization(Loan loan) {
		this.loan = loan;
		this.setCurrentBal(loan.getPrincipal());
	}

	/**
	 * @return the loan
	 */
	public Loan getLoan() {
		return loan;
	}

	/**
	 * @param loan the loan to set
	 */
	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	/**
	 * @return the monthlyPayToInt
	 */
	
	
	//other needed methods
	
	private double figuremonthlyPayToInt(){
	    return this.loan.getmonthlyRate()*(this.getCurrentBal());
	}
	 
	private double figuremonthlyPayToBal(){
	    return this.loan.getmonthlyPayment()-this.figuremonthlyPayToInt();
	}
	 
	private double figurecurrentBalAftPay(){
	    return this.getCurrentBal()-this.getMonthlyPayToBal();
	   
	}

	public double getMonthlyPayToInt() {
		return monthlyPayToInt;
	}

	/**
	 * @param monthlyPayToInt the monthlyPayToInt to set
	 */
	public void setMonthlyPayToInt(double monthlyPayToInt) {
		this.monthlyPayToInt = monthlyPayToInt;
	}

	/**
	 * @return the monthlyPayToBal
	 */
	public double getMonthlyPayToBal() {
		return monthlyPayToBal;
	}

	/**
	 * @param monthlyPayToBal the monthlyPayToBal to set
	 */
	public void setMonthlyPayToBal(double monthlyPayToBal) {
		this.monthlyPayToBal = monthlyPayToBal;
	}

	/**
	 * @return the currentBal
	 */
	public double getCurrentBal() {
		return currentBal;
	}

	/**
	 * @param currentBal the currentBal to set
	 */
	public void setCurrentBal(double currentBal) {
		this.currentBal = currentBal;
	}
	
	//String doAmortization stuff

		public String doAmortization(){
			String view;
			int counter=0;
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumFractionDigits(2);
			nf.setMinimumFractionDigits(2);
			
			view = "<table><tr><th>Month</th><th>Payment</th><th>Interest Paid</th><th>Principal Paid</th><th>Ending Balance</th></tr>";
			
			while( counter++ < loan.gettotalTerms()){
				
				
				view += "<tr><td>"+counter+"</td>";
				view += "<td>" +'$'+nf.format( this.loan.getmonthlyPayment() )+"</td>";
				view += "<td>"+'$'+nf.format( this.figuremonthlyPayToInt() )+"</td>";
				view += "<td>"+'$'+nf.format( this.figuremonthlyPayToBal() )+"</td>";
				this.setCurrentBal( this.getCurrentBal()-this.figuremonthlyPayToBal() );
				view += "<td>"+'$'+nf.format( this.figurecurrentBalAftPay() )+"</td>";
				
			}
			view += "</table>";
			return view;
		
	    }
	          

}
		
	
	

	
