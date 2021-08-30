package com.bridgelabz;

public class CompanyEmployeeWage {
	public final String company;
	public final int employeeRatePerHour;
	public final int numberOfWorkingDays;
	public final int maximumHoursPerMonth;
	public int totalEmployeeWage;

	public CompanyEmployeeWage(String company, int employeeRatePerHour, int numberOfWorkingDays,
			int maximumHoursPerMonth) {
		this.company = company;
		this.employeeRatePerHour = employeeRatePerHour;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maximumHoursPerMonth = maximumHoursPerMonth;
	}

	public void setTotalEmployeeWage(int totalEmployeeWage) {
		this.totalEmployeeWage = totalEmployeeWage;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company:	" + company + " is:" + totalEmployeeWage;
	}
}
