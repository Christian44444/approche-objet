package fr.diginamic.jdr;

import java.util.Scanner;

public class Personnage {
	private static int force = 0;
	private static int ptsVie = 0;
	private static int score = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Création personnage
		initPersonnage();
		
		Scanner scanner = new Scanner(System.in) ;
		boolean ok = true;
		String s1 = "";
		int choix = 0;
		Combat c1 = new Combat(); 
		
		System.out.println("Combattez 1(loup), 2(gobelin) ou 3(troll). terminez par 0");
		while (ok) {
			s1 = scanner.nextLine();
			try { choix = Integer.parseInt(s1);
				ok = c1.combattre(choix);
				// si on est toujours vivant
				// contrôler qu'on a gagné si oui sortir
				ok = false;
				for (Adversaire adversaire : c1.ennemis) {
					if (adversaire.getPtsVie() > 0) {
						ok = true;
						break;
					}
				} 
			}
			catch (NumberFormatException e) {
				// TODO: handle exception
				ok = false;
			}
		}
		// TODO voir comment gérer gagné ou perdu
		System.out.println("La moyenne est : ");
		scanner.close();

	}
	
	private static void initPersonnage() {
		int a = 12;
		int b = 18;
		setForce((int)Math.random() * (a - b));
		a = 20;
		b = 50;
		setPtsVie((int)Math.random() * (a - b));
		setScore(0);
	}

	public static int getForce() {
		return force;
	}

	public static void setForce(int force) {
		Personnage.force = force;
	}

	public static int getPtsVie() {
		return ptsVie;
	}

	public static void setPtsVie(int ptsVie) {
		Personnage.ptsVie = ptsVie;
	}

	public static int getScore() {
		return score;
	}

	public static void setScore(int score) {
		Personnage.score = score;
	}
	
	
}
