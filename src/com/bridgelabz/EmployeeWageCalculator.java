package com.bridgelabz;

public class EmployeeWageCalculator {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numberOfCompany = 0;
	private CompanyEmployeeWage[] companyEmployeeWageArray;

	public EmployeeWageCalculator() {
		companyEmployeeWageArray = new CompanyEmployeeWage[5];
	}

	private void addCompanyEmployeeWage(String company, int employeeRatePerHour, int numberOfWorkingDays,
			int maximumHoursPerMonth) {
		companyEmployeeWageArray[numberOfCompany] = new CompanyEmployeeWage(company, employeeRatePerHour,
				numberOfWorkingDays, maximumHoursPerMonth);
		numberOfCompany++;
	}

	private void computeEmployeeWage() {
		for (int i = 0; i < numberOfCompany; i++) {
			companyEmployeeWageArray[i].setTotalEmployeeWage(this.computeEmployeeWage(companyEmployeeWageArray[i]));
			System.out.println(companyEmployeeWageArray[i]);

		}
	}

	public int computeEmployeeWage(CompanyEmployeeWage companyEmployeeWage) {
		int employeeHours = 0, totalEmployeeHours = 0, totalWorkingDays = 0;
		while (totalEmployeeHours <= companyEmployeeWage.maximumHoursPerMonth
				&& totalWorkingDays < companyEmployeeWage.numberOfWorkingDays) {
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
		return totalEmployeeHours * companyEmployeeWage.employeeRatePerHour;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!");
		EmployeeWageCalculator employeeWageBuilder = new EmployeeWageCalculator();
		employeeWageBuilder.addCompanyEmployeeWage("DMart", 20, 20, 100);
		employeeWageBuilder.addCompanyEmployeeWage("Reliance", 10, 25, 200);
		employeeWageBuilder.computeEmployeeWage();
	}
}