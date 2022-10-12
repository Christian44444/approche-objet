package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// La classe Compte étant la Classe mère on peut faire référence 
		// à tous les types d'objets filles lui étant rattachés
		Compte cpt1 = new Compte( "361771110001234", 145000000.45);
		CompteTaux cptT1 = new CompteTaux("361771110001235",65.45, 2.5);
		
		Compte[] cptDivers = new Compte[2]; // Peut contenir n'importe quel type fille 
		cptDivers[0] = cpt1; // Compte ou cptDivers[0] = new Compte( "361771110001234", 145000000.45);
		cptDivers[1] = cptT1; // CompteTaux cptDivers[1] = new CompteTaux("361771110001235",65.45, 2.5);
		// ou directement Compte cptDivers = {new Compte(...), new CompteTaux(...)};
		
		for (int i = 0; i < cptDivers.length; i++) {
			Compte compte = cptDivers[i];
			System.out.println(compte); // ou System.out.println(cptDivers[i]);
		} 
		
		
	}

}
