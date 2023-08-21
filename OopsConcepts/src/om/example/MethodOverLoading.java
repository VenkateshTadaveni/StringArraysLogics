package om.example;

class MethodOverLoading {
	public static String formatNumber(int n) {
		return String.format("%d", n);

	}

	public static String formatNumber(double s) {
		return String.format("%.6f", s);
	}

	public static String formatNumber(String d) {
		return String.format("%.2f", Double.parseDouble(d));
	}


//public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading s = new MethodOverLoading();
	System.out.println(s.formatNumber(1234));
	System.out.println(s.formatNumber(2234.4567));
	System.out.println(s.formatNumber("400"));
		

	}
}


