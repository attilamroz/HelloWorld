
public class Scanner {

	static java.util.Scanner scanner = new java.util.Scanner(System.in);
	static String input = "";
	static String zustand = "";
	public static void main(String[] args) {
		chapter1v1();
	}

	public static void chapter1v1() {
		input = scanner.nextLine();
		if(input.equals("Hallo")) {
			System.out.println(" Hallo. Wie geht es dir?");
			chapter1v2();
		} else {
			chapter1v1();
		}
	}
	
	public static void chapter1v2() {
		input = scanner.nextLine();
		if(input.equals("Gut")) {
			System.out.println(" Das freut mich.");
			zustand = input;
			//chapter1v3();
		} else if(input.equals("Schlecht")) {
			System.out.println(" Du armer.");
			zustand = input;
			//chapter1v3();
		} else {
			chapter1v2();
		}
	}

}
