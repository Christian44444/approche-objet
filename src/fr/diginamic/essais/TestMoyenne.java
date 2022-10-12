package fr.diginamic.essais;

import java.util.Scanner;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
	public static void main(String[] args) 
	{
		Scanner scanner    = new Scanner(System.in) ;
 		CalculMoyenne cal1 = new CalculMoyenne(); 
 		double nb = 0;
 		boolean ok = true;
 		String s1 = "";
 		
		System.out.println("Donnez vos nombres pour calculer la moyenne. terminez par 0");
		while (ok) {
			s1 = scanner.nextLine();
			try { nb = Double.parseDouble(s1);
				cal1.ajout(nb);
			}
			catch (NumberFormatException e) {
				// TODO: handle exception
				ok = false;
			}
		}
		System.out.println("La moyenne est : " + cal1.calcul());
		scanner.close();
	}
}
