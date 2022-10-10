package com.app.org;

public abstract class Emp extends Exception {
	private static int idgenerator=1;
	private String name;
	private String deptId;
	private double basic;
	private int id;
	public Emp (String name,String deptId, double basic) {
		id=idgenerator++;
		this.name=name;
		this.deptId=deptId;
		this.basic=basic;
}
	
	@Override
	public String toString() {
		return "The Emp details are: "+"Id:"+" "+id+" "+"Name"+" "+name+" "+"departmentId"+" "+" "+deptId+"BasicSalary"+" "+basic;
	}

	public abstract double computeNetSalary();
	
	
	public double getBasic() {
		return basic;
	}
	public void setIncPer(double b) {
	basic=(b/basic)*100;
	
	}
	
}

