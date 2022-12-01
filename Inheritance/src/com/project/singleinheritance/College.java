package com.project.singleinheritance;
//child class
public class College extends University {
	
	public void displayDetailsOfcollege()
	{
		System.out.println("Invoked displayDetailsOfcollege()");
		System.out.println("Name"+ Name);
		System.out.println("Location:"+location);
		System.out.println("Contact Number:"+contactNumber);
	}
	
	public void conductingExams()
	{
		System.out.println("Invoked conductingExams()");
		System.out.println("College is conducting govt Exams");
	}
	
	public void ethnicDay()
	{
		System.out.println("Invoked ethnicDay()");
		System.out.println("college is conducting Ethnic day");
	}

}
