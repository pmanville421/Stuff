/**
 * 
 */
package payroll;

/**
 * @author craigpiercy
 *
 */
public class StudentEmployee extends HourlyEmployee {


	public StudentEmployee() {
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 * @param monthlyHours
	 * @param hourlyRate
	 */
	public StudentEmployee(String firstName, String lastName, int employeeNumber, int monthlyHours, double hourlyRate) {
		super(firstName, lastName, employeeNumber, monthlyHours, hourlyRate);
	}

	/* (non-Javadoc)
	 * 
	 */
	@Override
	public double getMonthlyPay() {
		double monthlyPay = 0.0;
		if (this.getMonthlyHours() <= 40 ){
			monthlyPay = this.getHourlyRate() * this.getMonthlyHours() ;
		} else {
			monthlyPay = this.getHourlyRate() * 40;
		}
		return monthlyPay;
	}

	/* (non-Javadoc)
	 * 
	 */
	@Override
	public String getEmployeeType() {
		return "Student Worker";
	}

	/* (non-Javadoc)
	 * 
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StudentEmployee [monthlyHours=" + this.getMonthlyHours() + ", hourlyRate=" + this.getHourlyRate() + ", getMonthlyPay()="
		+ this.getMonthlyPay() + ", getEmployeeType()=" + this.getEmployeeType() + ", getFirstName()=" + this.getFirstName()
		+ ", getLastName()=" + this.getLastName() + ", getEmployeeNumber()=" + this.getEmployeeNumber() + "]";
	}

	
	
	
	
}
