package com.school.management;

public class School {
	
	private String name;
    private String location;
    public void showSchoolInfo() {
    	System.out.println("School Name:" + name);
    	System.out.println("School Location:" +location);
       }
       public void setName(String name){
    	   this.name=name;
       }
       public void setLocation(String location) {
    	   this.location=location;
       }
      public String getname() {
    	  return name;
    }
      public String getlocation() {
    	  return location;
}
}