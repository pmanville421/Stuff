/**
 * 
 */
package payroll;

/**
 * @author craigpiercy
 *
 */
public class HourlyEmployee extends Employee {
	 private int monthlyHours;
	 private double hourlyRate;

	/**
	 * 
	 */
	public HourlyEmployee() {
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 */
	public HourlyEmployee(String firstName, String lastName, int employeeNumber, int monthlyHours, double hourlyRate) {
		super(firstName, lastName, employeeNumber);
		this.monthlyHours = monthlyHours;
		this.hourlyRate = hourlyRate;
	}

	/**
	 * @return the monthlyHours
	 */
	public int getMonthlyHours() {
		return monthlyHours;
	}

	/**
	 * @param monthlyHours the monthlyHours to set
	 */
	public void setMonthlyHours(int monthlyHours) {
		this.monthlyHours = monthlyHours;
	}

	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	/* (non-Javadoc)
	 *
	 * overrides the employee method
	 */
	@Override
	public double getMonthlyPay(){
		return this.hourlyRate * this.monthlyHours;
	}
	
	/**
	 * returns a String with the type of employee object
	 */
	@Override
	public String getEmployeeType(){
		return "Hourly Employee";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HourlyEmployee [monthlyHours=" + monthlyHours + ", hourlyRate=" + hourlyRate + ", getMonthlyPay()="
				+ getMonthlyPay() + ", getEmployeeType()=" + getEmployeeType() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getEmployeeNumber()=" + getEmployeeNumber() + "]";
	}

}
