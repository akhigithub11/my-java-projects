package com.project.singleinheritance;

public class SingleInheritancetester {
	
public static void main(String[] args) {
	
	University U1=new University();
	 U1.Name="JNTU";
	 U1.location="Hyderabad";
	 U1.contactNumber=776554789292l;
	 
	 U1.displayDetailsOfUniversity();
	 U1.examFees();
	 U1.Result();
	 System.out.println("********************************8");
	 
	 College C1=new College();
	 C1.Name="KECW";
	 C1.location="Guntur";
	 C1.contactNumber=99865463899l;
	 C1.displayDetailsOfcollege();
	 C1.conductingExams();
	 C1.ethnicDay();
	 
	 
	 
	
}
}
