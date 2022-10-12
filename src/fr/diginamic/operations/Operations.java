package fr.diginamic.operations;

public class Operations {
	public static double calcul(double a, double b, String operateur) {
		switch (operateur) {
		case "+": {
			return a + b;
			// break;
		}
		case "-": {
			return a - b;
			// break;
		}
		case "*": {
			return a * b;
			// break;
		}
		case "/": {
			if (b == 0) {
				System.out.println("La division par 0 est interdite!");
				return 0.0;
			} else {
				return a / b;	
			}
			// break;
		}
		default:
			System.out.println("L'opérateur n'est pas valide seuls +-*/ sont autorisés");
			return 0.0;
			// break;
		}
		
		
	}
}
