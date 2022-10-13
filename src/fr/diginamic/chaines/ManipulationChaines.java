package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaines {
	static String chaine = "Durand;Marcel;2 523.5";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaineTravail = "";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("Longueur de la chaine: " + chaine.length());
		System.out.println(chaine.indexOf(";"));
		chaineTravail = chaine.substring(0,chaine.indexOf(";"));
		System.out.println(chaineTravail); // Durand
		System.out.println(chaineTravail.toUpperCase() + " " + chaineTravail.toLowerCase());
		
		String[] resultatString = chaine.split(";"); 
		for (String string : resultatString) {
			System.out.println(string);
		}
		Salarie sal1 = new Salarie(resultatString[0],resultatString[1],Double.parseDouble(resultatString[2].replace(" ","")));
		System.out.println(sal1.toString());
	}

}
