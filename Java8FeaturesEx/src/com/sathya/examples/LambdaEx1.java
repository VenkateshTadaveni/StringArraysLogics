package com.sathya.examples;

@FunctionalInterface
interface VoteService
{
	public String votecheck( String name, int age, String location);
}
public class LambdaEx1 {

	public static void main(String[] args) {
		VoteService v1= ( name, age, location)->(age>=18)&&location.equals("hyd")?"Eligible":"Not";
  String vote=v1.votecheck("Venkatesh",20,"hyd");

 System.out.println("success"+vote);
 
 
 String s2=v1.votecheck("Karthik", 17, "hyd");
 System.out.println("done "+s2);
 
 String s3=v1.votecheck("Sai pawan", 17, "Hyd");
 System.out.println("done "+s3);
 
		
	}
	
}


