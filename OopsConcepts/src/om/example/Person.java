package om.example;


class Member{
private int age;
private float salary;


public void setAge (int age) {
	this.age=age;
	
}
public int getAge() {
	return age;
}

public void setSalary(float salary) {
	this.salary=salary;
}
public float getSalary() {
	return salary;
}
}


public class Person extends Member{
	 private String name;
	public static void main(String[] args) {
		Person person=new Person();
		System.out.println(person.name);
System.out.println(person.getAge());
System.out.println(person.getSalary());
	}
	

}
