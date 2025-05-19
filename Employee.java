package com.company.hr;

public class Employee {
	private int id;
	private String name;
	private double salarly;
	
	public void showEmployeeDetails() {
		System.out.println("Employee Id:" +id);
		System.out.println("Employee Name:" +name);
		System.out.println("Employee Salarly:" +salarly);
	}
	    public void setId(int id) {
	    	this.id = id;
	    	
	    }
	    public void setName(String name) {
	    	this.name = name;
	    }	
	    public void setSalarly(double Salarly) {
	    	this.salarly=salarly;
	    }
	    public int getId() {
	    	return id;
	    }
	    public String getname() {
	    	return name;
	    }
	    public double getsalarly() {
	    	return salarly;
	    } 	
	}


