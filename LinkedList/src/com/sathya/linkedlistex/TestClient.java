package com.sathya.linkedlistex;

public class TestClient {

	public static void main(String[] args) {
		SetterGetExDemo emp1=new SetterGetExDemo();
		
		
		emp1.setEid(123);
		emp1.setEname("siva");
		emp1.setEsal(100003.98);
		System.out.println( "employee eid"+emp1.getEid());
		System.out.println( "employee name"+emp1.getEname());
		System.out.println( "employee salry"+emp1.getEsal());
System.out.println("**********************");
		SetterGetExDemo emp2=new SetterGetExDemo();
		emp2.setEid(122);
		emp2.setEname("Venkatesh");
		emp2.setEsal(145000.34);
		System.out.println("Emp id is......>"+emp2.getEid());
		System.out.println("Employee name is....>"+emp2.getEname());
		System.out.println("emp salary is...>"+emp2.getEsal());
	}

}
