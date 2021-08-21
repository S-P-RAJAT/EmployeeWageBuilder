package com.bridgelabz;

public class EmployeeWageCalculator {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!");
		int fullTime = 1;
		int wagePerHour = 20;
		int empHours = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == fullTime)
			empHours = 8;
		else
			empHours = 0;
		empWage = empHours * wagePerHour;
		System.out.println("Emp Wage:" + empWage) ;
	}
}