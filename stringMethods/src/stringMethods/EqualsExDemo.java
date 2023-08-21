package stringMethods;

public class EqualsExDemo {

	public static void main(String[] args) {
		
		String s="sathya";
		String s1="Sathya";
		System.out.println(s.equals(s1));
		
		StringBuffer s2=new StringBuffer("Venkatesh");
		StringBuffer s3=new StringBuffer("Venkatesh");
		String s4="Venkatesh";
		System.out.println(s2.equals(s4));
		
		
		
		String s5="Venkatesh";
		
		System.out.println(s4==s5);
		System.out.println("***************");
		System.out.println(s2==s3);
		
		
		System.out.println(s2.equals(s3));
	}
	
	
	
	

}
