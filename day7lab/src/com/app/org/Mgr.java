package com.app.org;

public class Mgr extends Emp {
	private double performanceBonus;
public Mgr(String name,String deptId, double basic, double performanceBonus) {
	super(name,deptId,basic);// program to invoke super cls constructor
	this.performanceBonus=performanceBonus;
	}
	
@Override
public String toString() {
	return "manager "+super.toString()+" "+"performanceBonus"+" "+performanceBonus;
}
@Override
public double computeNetSalary() {
	return super.getBasic()+performanceBonus;
}

public double getPerformanceBonus() {
	return performanceBonus;
}

}
