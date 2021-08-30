package com.bridgelabz;

public class EmployeeWageCalculator {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		int employeeHours = 0, totalEmployeeHours = 0, totalWorkingDays = 0;
		while (totalEmployeeHours <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
		int totalEmployeeWage = totalEmployeeHours * empRatePerHour;
		System.out.println("Total Emp Wage for Company: " +company+" is:"+ totalEmployeeWage);
		return totalEmployeeWage;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!");
		computeEmpWage("DMart", 20, 20, 100);
		computeEmpWage("Reliance", 10, 25, 200);
	}
}