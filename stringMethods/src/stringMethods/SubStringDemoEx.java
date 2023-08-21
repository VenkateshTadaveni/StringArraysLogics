package stringMethods;

public class SubStringDemoEx {

	public static void main(String[] args) {
	

		String s="madam arrora teach malayalam and i like malayalam language";
		String[]s1=s.split(" ");
		int length=0;
		int max=0;
		for(int i=0;i<=s1[i].length()-1;i++) {
			length++;
		
		if(length>=max) {
			max=length;	
			System.out.println(length +"  "+s1[i]);
		}
		
	}

}
}
