
public class Example {

	public static void main(String[] args) {
		int[] n= {1,2,3,4,5,6};
		int sum=0,count=0;
		double avg;
		for(int x:n) {
			System.out.println(x);
	 sum=sum+x;
		count++;	
		}
		System.out.println("*************");

		System.out.println(sum);
		System.out.println("*************");
	System.out.println(count);
	System.out.println("*************");

	avg=sum/count;
	System.out.println(avg);
	}
	

}
