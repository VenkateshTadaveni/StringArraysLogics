package com.sathya.examples;


import java.util.List;
import java.util.stream.Collectors;
public class ExampleForLearn {
  public static void main(String[] args) {
		List<Emp>emp  = List.of(new Emp(45, "devi", 2000.45),
								new Emp(23, "ratan", 3000.45),
								new Emp(67, "O madhu",20.45),
								new Emp(12, "Ra madhu", 1500.45),
								new Emp(34, "po madhu", 5000.54));
		
		emps.stream()
			.filter(emp->(emp.ename).contains()
			.forEach(emp->System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
		System.out.println("*********");		
		List<Emp> listEmps = emps.stream()
			.filter(emp->emp.esal>2500)
			.collect(Collectors.toList());
		listEmps.forEach(emp->System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
	
		System.out.println("*********");
		long count = emps.stream()
			.filter(emp->emp.ename.contains("madhu") && emp.esal>1000)
			.count();
		System.out.println(count);
		
		System.out.println("********");
		
		Emp e = emps.stream()
					.filter(emp->emp.esal>1000)
					.findFirst()
					.get();
		System.out.println(e.eid+" "+e.ename+" "+e.esal);
	}
}
