package com.company.app;

import com.company.hr.Employee;
import com.company.admin.Department;
public class CompanyApp{

    public static void main(String[] args) {
    	Employee e=new Employee();
    	e.setId(101);
    	e.setName("Ashok");
    	e.setSalarly(100000);
    	
    	Department d=new Department();
    	d.setdeptName("CSE");
    	d.setdeptId(120);
    	
    	e.showEmployeeDetails();
    	d.showDepartmentDetails();
    }
    
         

	}
