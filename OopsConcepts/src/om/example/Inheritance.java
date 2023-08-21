package om.example;

class Fruits{
	  void name() {
		System.out.println("This is main fruits class");
	}
}
class Banana extends Fruits{
	static void work() {
		System.out.println("this is banana");
	}
}
class Apple extends Banana{
	 void best() {
		System.out.println("Apple is the best to eat");
	}
}
class Mango extends Apple{
	 void season() {
		System.out.println("tHis is seasonal friut");
	}
}



public class Inheritance {
	public static void main(String[] args) {
	
	Mango m=new Mango();
	m.best();
	m.name();
	m.work();
	m.season();
    
}
}
