package com.bridgelabz;

public class EmployeeWageCalculator {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!");
		int employeeHours = 0, totalEmployeeHours = 0, totalWorkingDays = 0;
		while (totalEmployeeHours <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
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
		int totalEmployeeWage = totalEmployeeHours * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage: " + totalEmployeeWage);
	}
}