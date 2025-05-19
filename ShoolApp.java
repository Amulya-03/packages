package com.school.app;
import com.school.management.School;
import com.school.staff.Principal;
public class ShoolApp {
	
	public static void main(String[] args) {
		School s=new School();
		
		s.setName("SVHS");
		s.setLocation("Karimnagar");
		
		Principal p=new Principal();
		
	    p.setPrincipalName("Harjith Kaur");
	    p.setExperienceYears(20);
	    
	    s.showSchoolInfo();
	    p.showPrincipalInfo();
	}

}
