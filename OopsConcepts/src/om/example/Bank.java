package om.example;

 class Bankok {
	
	public Bankok() {
		System.out.println("This is bank constructor");
	}
	int getRateOfIntrest(){
		return 10;
	}
}
class Sbi{
	int getRateOfIntrest(int n) {
		System.out.println(n);
		return 20;
	
	}
}
class Axis extends Bankok{
	int getRateOfIntrest() {
		return 1;
	}
}
class Icici extends Bankok{
	int getRateOfIntrest() {
		return 123;
	}
}
public class Bank {
	public static void main(String[] args) {
		Sbi s=new Sbi();
		Axis a=new Axis();
		Icici i=new Icici();
		System.out.println(s.getRateOfIntrest(100));
		System.out.println(a.getRateOfIntrest());
		System.out.println(i.getRateOfIntrest());
	}
}