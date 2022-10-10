package com.app.org;

public class Worker extends Emp {
	private double hoursWorked;
	private double hourlyRate;
	public Worker(String name,String deptId, double basic, double hoursWorked, double hourlyRate) {
	super(name,deptId,basic); //prog to invoke ctor of superclass
	this.hoursWorked=hoursWorked;
	this.hourlyRate=hourlyRate;
}
	
@Override //to override the method to get the complete worker details
public String toString() {
	return " Worker : "+super.toString()+"hours worked"+hoursWorked+"Hourly rate "+" "+hourlyRate;
}

@Override
public double computeNetSalary() {
return super.getBasic()+(hoursWorked*hourlyRate);
}

public double getHourlyRate() {
	return hourlyRate;
	
}
}