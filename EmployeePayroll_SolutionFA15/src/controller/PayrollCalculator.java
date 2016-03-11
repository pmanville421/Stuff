package controller;

import java.text.NumberFormat;

import payroll.*;

public class PayrollCalculator {
	
	

	public static void main(String[] args) {
		
		PayrollCalculator pc = new PayrollCalculator();
		
		Employee[] employees = pc.loadEmployees();
		
		pc.printReport(employees);
		
	}
	


	private Employee[] loadEmployees(){
		Employee[] employees = new Employee[4];
		
		SalariedEmployee victor = new SalariedEmployee();
		victor.setEmployeeNumber(1);
		victor.setFirstName("Victor");
		victor.setLastName("Marx");
		victor.setYearlySalary(65000.00);
		
		employees[0] = victor;    // note that since SalariedEmployee inherits (extends) Employee it IS an Employee and can be added to an array of Employee objects
		
		SalariedEmployee nicolas = new SalariedEmployee();

		nicolas.setEmployeeNumber(2);
		nicolas.setFirstName("Nic");
		nicolas.setLastName("Alexander");
		nicolas.setYearlySalary(89000.00);
		
		employees[1] = nicolas;    // note that since SalariedEmployee inherits (extends) Employee it IS an Employee and can be added to an array of Employee objects
		
		HourlyEmployee estelle = new HourlyEmployee();

		estelle.setEmployeeNumber(3);
		estelle.setFirstName("Estelle");
		estelle.setLastName("Helene");
		estelle.setHourlyRate(8.5);
		estelle.setMonthlyHours(160);
		
		employees[2] = estelle;    // note that since HourlyEmployee inherits (extends) Employee it IS an Employee and can be added to an array of Employee objects
		
		StudentEmployee craig = new StudentEmployee();

		craig.setEmployeeNumber(4);
		craig.setFirstName("Craig");
		craig.setLastName("Allan");
		craig.setHourlyRate(8.0);
		craig.setMonthlyHours(45);
		
		employees[3] = craig;    // note that since SalariedEmployee inherits (extends) Employee it IS an Employee and can be added to an array of Employee objects
		
		
		return employees;
	}
	
	private void printReport(Employee[] employees) {
		
		// Even though they are different employee types, in this method, they are all treated as Employee type
		// but each one will use the appropriate getMonthlyPay for it's original type
		// This is an example of polymorphism.
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		
        System.out.println("***** Payroll Report *****");
        double totalPayroll = 0.0;
        for (int index = 0; index < employees.length; index++){
        	String line = "";
        	line += "Name:" + employees[index].getLastName() + ", " + employees[index].getFirstName();
        	line += "\tType:" + employees[index].getEmployeeType();
        	line += "\tMonthly Pay:" + cf.format(employees[index].getMonthlyPay());
        	System.out.println(line);
        	
        	totalPayroll += employees[index].getMonthlyPay();
        }
        System.out.println("Total Payroll: " + cf.format(totalPayroll));
	}

}
