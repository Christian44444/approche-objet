package entites;

import entite2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne pers1 = new Personne("MICHAUD","Christian",new AdressePostale(28, "rue des eucalyptus", 44300, "Nantes"));
//		pers1.nom = "MICHAUD";
//		pers1.prenom = "Christian";
//		pers1.adrPersonne.numeroRue = 28;
//		pers1.adrPersonne.libelleRue ="rue des eucalyptus";
//		pers1.adrPersonne.codePostal = 44300;
//		pers1.adrPersonne.ville = "Nantes";
		
//		plus lisible
		AdressePostale p2 = new AdressePostale(28, "rue des eucalyptus", 44300, "Nantes");
		Personne pers2 = new Personne("Michaud","Emmanuelle",p2);
		
//		pers2.nom = "MICHAUD";
//		pers2.prenom = "Emmanuelle";
//		pers2.adrPersonne.numeroRue = 28;
//		pers2.adrPersonne.libelleRue ="rue des eucalyptus";
//		pers2.adrPersonne.codePostal = 44300;
//		pers2.adrPersonne.ville = "Nantes";
//		Personne pers3 = new Personne("MICHAUD","Emmanuelle");
		System.out.println(pers1.prenom + " TP");
		System.out.println(pers2.prenom + " TP");
//		System.out.println(pers3.adrPersonne); ne pas aller plus loin car les propriétés ne sont pas définies
		
//		Affichage Nom et prénom avec Nom en majuscule
		pers2.affichNomPrenom();
		
// 		première méthode pour modifer l'adresse
		AdressePostale p3 = new AdressePostale(12, "rue des quai", 44000, "Nantes");
		pers2.setAdrPersonne(p3);
//   	Autre méthode pour modifier l'adresse		
		pers2.changeAdresse(10, "rue émile Zola", 44000, "Nantes");
		
	}

}
