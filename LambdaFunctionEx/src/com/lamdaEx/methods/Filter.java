package com.lamdaEx.methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.w3c.dom.stylesheets.LinkStyle;

@SuppressWarnings("unused")
public class Filter {

	public static void main(String[] args) {
		System.out.println("*********forEach single consumer*******************");

		List<String> names = List.of("siva", "hello", "venkat", "kalyan", "pawan", "santhu");
		names.forEach(name -> System.out.println(name));
		System.out.println("***********forEach Biconsumer*****************");

		Map<String, Integer> nums = Map.of("venkat",19,"hkudshf",10);
nums.forEach((n1,n2)->System.out.println(n1+" "+n2));

System.out.println("****************************");


Set<String>names2= Set.of("venky","hello","hi","india");
names2.forEach(names3->System.out.println(names3));

		System.out.println("****************************");
		List<Integer> number = List.of(1, 2, 3, 4, 54);
		number.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
		number.stream().filter(v -> v % 2 != 0).forEach((v) -> System.out.println(v));

		List<String> names1 = List.of("venky", "kalyan", "chintu", "shiva", "sai pawan");
		names.stream().filter(s -> s.startsWith("s")).forEach(n -> System.out.println(n));

	}

}
