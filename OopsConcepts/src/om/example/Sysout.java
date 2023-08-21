package om.example;


class A{
	void show() {
		System.out.println("this is empty parameter");
	}
	void show(int a) {
		System.out.println("One Arg parameter");
	}
	void show(int a,String b) {
		System.out.println("Two args parameter");
	}
}
public class Sysout {

	public static void main(String[] args) {
		A a=new A();
		a.show();
		a.show(10);
		a.show(20,"venky");

	}

}
