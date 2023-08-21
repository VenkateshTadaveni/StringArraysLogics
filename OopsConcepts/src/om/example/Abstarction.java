package om.example;

interface abstraction {
	default void wish() {
		System.out.println("this is first Interface ");
	}

	abstract void pranav();
}

interface polymorphism {
	default void method() {
		System.out.println("this is another interface");
	}
}

public class Abstarction implements abstraction, polymorphism {

	public static void main(String[] args) {
		Abstarction ab = new Abstarction();
		ab.pranav();
		ab.wish();
		ab.method();
		// polymorphism.method();
	}
	@Override
	public void pranav() {
		System.out.println("This is Abstract Method");

	}
}
