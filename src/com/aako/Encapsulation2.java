package com.aako;

class Employee{
	private String ename;
	private String eID;
    private long Salary;
	
    public void SetName(String name) {
    	this.ename=name;
    }
    public void Getname() {
    	System.out.println("Employee's Name: "+ ename);
    	
    }
    
    public void SetId(String id) {
    	this.eID=id;
    	
    }
    public void GetId() {
    	System.out.println("Employee;s id: "+ eID);
    }
    
    public void Setsal(long sal) {
    	this.Salary=sal;
    }
    
    public void  GetSal() {
    	System.out.println("Employee's Salary: "+ Salary);
    }
	
}

public class Encapsulation2 {
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.SetName("AAKO");
		e1.SetId("SOETAM3");
		e1.Setsal(1000000000);
		
		e1.GetId();
		e1.Getname();
		e1.GetSal();
		
		
	}
}
