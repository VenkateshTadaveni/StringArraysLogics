package om.example;

public class MethodOverLoad {
	static  int method(int a,int b) {
		return a+b;
		
	}
	static int method(int a,int b,int c) {
		return a+b+c;
		
	}

	public static void main(String[] args) {
		
		System.out.println(MethodOverLoad.method(10, 200));
		System.out.println(MethodOverLoad.method(10, 200, 300));

	}

}
