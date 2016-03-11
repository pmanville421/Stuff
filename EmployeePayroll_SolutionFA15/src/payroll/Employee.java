/**
 * 
 */
package payroll;

/**
 * @author craigpiercy
 *
 */
public class Employee {
	
	private String firstName;
	private String lastName;
	private int employeeNumber;
	
	/**
	 * Default, no parameter constructor
	 */
	public Employee() {
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 * 
	 * Overloaded constructor - the user of this class can choose to provide values upon instantiatiing the class
	 */
	public Employee(String firstName, String lastName, int employeeNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the employeeNumber
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	/**
	 * basic getMonthlyPay() method - will be overridden in child classes
	 */
	public double getMonthlyPay(){
		return 0.0;
	}
	
	/**
	 * returns a String with the type of employee object
	 */
	public String getEmployeeType(){
		return "Employee";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeNumber=" + employeeNumber
				+ ", getMonthlyPay()=" + getMonthlyPay() + ", getEmployeeType()=" + getEmployeeType() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
