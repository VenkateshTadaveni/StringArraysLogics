package withsisterfun;

public class StringPalindrome {

	public static void main(String[] args) {

		String s="venkatesh venky hai hello";
		String res=" ";
		String[] str=s.split(" ");
	
		for(int i=0;i<=str.length-1;i++) {
			for(int j=0;j<=str.length-1;j++) {
				
				if(str[i]==str[j]) {
				res=res+str[j];
				}
				
		}
			
			
		}
		System.out.println("  "+ res);
		
	}
}
	


