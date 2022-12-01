package com.project.singleinheritance;

public class University {
//Parent class
	String Name;
	String location;
	long contactNumber;
	
public void displayDetailsOfUniversity()
{
	System.out.println("Invoked displayDetailsOfUniversity()");
	System.out.println("Name"+Name);
	System.out.println("Location:"+location);
	System.out.println("Contact Number:"+contactNumber);
}

public void examFees()
{
	System.out.println("Invoked examFees()");
	System.out.println("University announced Exam fees");
}
	
public void Result()
{
	System.out.println("Invoked Result()");
	System.out.println("University announced Results");
}
}
