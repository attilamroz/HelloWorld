package basics;

public class Bedingung {

	public static void main(String[] args) {
		boolean bool_var;
		bool_var = false;
		//
		if (bool_var == false) {
			System.out.println("1-Bool Var ist falsch");
		}
		// bool_var = false => Zuweisung => bool_var = false, boolvar == true?
		if (bool_var = false) {
			System.out.println("2-Bool Var ist falsch");
		}
		//
		if (!(bool_var = false)) {
			System.out.println("3-Bool Var ist falsch");
		}
		//
		if (!bool_var) {
			System.out.println("Bool Var ist  false");
		}
		//
		bool_var = true;
		//
		if (bool_var) {
			System.out.println("Bool Var ist  wahr");
		}
		//
		if (bool_var == true) {
			System.out.println("1-Bool Var ist richtig");
		}
		//
		if (bool_var != false) {
			System.out.println("2-Bool Var ist richtig");
		}
		//
		//
		if (bool_var) {
			System.out.println("wahr");
		} else {
			System.out.println("falsch");
		}
		//
		// && - verbindet Abfragen, die alle wahr sein müssen "logisches und"
		if (true && true && true) {
			System.out.println("sucsessfull");
		}
		// || "logisches oder" mind. eines muss erfüllt sein
		if (true || false) {
			System.out.println("sucsessfull");
		}

	}

}
