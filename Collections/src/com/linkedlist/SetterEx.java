package com.linkedlist;

class Student{
	private int id;
	private String name;
	private String email;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public int getId() {
		return id;
	}
	public String getName(){
		return name;
	}	
	public String getEmail() {
		return email;
	}
	
	public Student(int id, String name, String email) {
	this.id=id;
	this.name=name;
	this.email=email;
	}

//	@Override
//	public String toString() {
//		return "[id=" + id + ", name=" + name + ", email=" + email + "]";
//	}


}
public class SetterEx {

	public static void main(String[] args) {
		Student student=new Student(123,"venky","venky123@gmail.com");
		
		
		System.out.println(student.getId()+student.getName());
//		student.setId(111);
//		student.setName("venkatesh");
//		student.setEmail("venky123@gmail.com");
//		System.out.println(student.getId()+student.getName()+student.getEmail());

	}


}
