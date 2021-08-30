package com.bridgelabz;

public class EmployeeWageCalculator {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int employeeRatePerHour;
	private final int numberOfWorkingDays;
	private final int maximumHoursPerMonth;
	private int totalEmployeeWage;

	public EmployeeWageCalculator(String company, int employeeRatePerHour, int numberOfWorkingDays,
			int maximumHoursPerMonth) {
		this.company = company;
		this.employeeRatePerHour = employeeRatePerHour;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maximumHoursPerMonth = maximumHoursPerMonth;
	}

	public void computeEmployeeWage() {
		int employeeHours = 0, totalEmployeeHours = 0, totalWorkingDays = 0;
		while (totalEmployeeHours <= maximumHoursPerMonth && totalWorkingDays < numberOfWorkingDays) {
			totalWorkingDays++;
			int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (employeeCheck) {
			case IS_FULL_TIME:
				employeeHours = 8;
				break;
			case IS_PART_TIME:
				employeeHours = 4;
				break;
			default:
				employeeHours = 0;
			}
			totalEmployeeHours += employeeHours;
			System.out.println("Day " + totalWorkingDays + " - Hours worked: " + employeeHours);
		}
		totalEmployeeWage = totalEmployeeHours * employeeRatePerHour;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company:	" + company + " is:" + totalEmployeeWage;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!");
		EmployeeWageCalculator dMart = new EmployeeWageCalculator("DMart", 20, 20, 100);
		EmployeeWageCalculator reliance = new EmployeeWageCalculator("Reliance", 10, 25, 200);
		dMart.computeEmployeeWage();
		System.out.println(dMart);
		reliance.computeEmployeeWage();
		System.out.println(reliance);
	}
}