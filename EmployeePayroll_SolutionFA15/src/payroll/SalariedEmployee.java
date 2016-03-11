/**
 * 
 */
package payroll;

/**
 * @author craigpiercy
 *
 */
public class SalariedEmployee extends Employee {
	
	private double yearlySalary;
	

	/**
	 * Default, no parameter constructor
	 */
	public SalariedEmployee() {
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 */
	public SalariedEmployee(String firstName, String lastName, int employeeNumber, double yearlySalary) {
		super(firstName, lastName, employeeNumber);
        this.yearlySalary = yearlySalary;		
	}
	
	
	
	/**
	 * @return the yearlySalary
	 */
	public double getYearlySalary() {
		return yearlySalary;
	}

	/**
	 * @param yearlySalary the yearlySalary to set
	 */
	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	/* (non-Javadoc)
	 *
	 * overrides the employee method
	 */
	@Override
	public double getMonthlyPay(){
		return this.yearlySalary / 12.0;
	}
	
	/**
	 * returns a String with the type of employee object
	 */
	@Override
	public String getEmployeeType(){
		return "Salaried Employee";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SalariedEmployee [yearlySalary=" + yearlySalary + ", getMonthlyPay()=" + getMonthlyPay()
				+ ", getEmployeeType()=" + getEmployeeType() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getEmployeeNumber()=" + getEmployeeNumber() + "]";
	}
	
	
	
	
	
	
	
}
