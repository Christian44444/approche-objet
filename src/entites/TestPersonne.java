package entites;

import entite2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne pers1 = new Personne();
		pers1.nom = "MICHAUD";
		pers1.prenom = "Christian";
		pers1.adrPersonne.numeroRue = 28;
		pers1.adrPersonne.libelleRue ="rue des eucalyptus";
		pers1.adrPersonne.codePostal = 44300;
		pers1.adrPersonne.ville = "Nantes";
		
		Personne pers2 = new Personne();
		pers2.nom = "MICHAUD";
		pers2.prenom = "Christian";
		pers2.adrPersonne.numeroRue = 28;
		pers2.adrPersonne.libelleRue ="rue des eucalyptus";
		pers2.adrPersonne.codePostal = 44300;
		pers2.adrPersonne.ville = "Nantes";
		
	}

}
