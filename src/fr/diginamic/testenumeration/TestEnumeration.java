package fr.diginamic.testenumeration;

/**
 * Classe de test des énumérations
 * @author cmich
 *
 */
public class TestEnumeration {

	/**
	 * Point d'entrée exécutable pour tester les enumérations 
	 * @param args
	 */
	public static void main(String[] args) {
		// Afficher toutes les saisons
		Saison[] s1 = Saison.values();
		for (Saison saison : s1) {
			System.out.println(saison + " -> " + saison.getNom() + " " + saison.getRang());
		}
		// Récupérer par une méthode de base le libellé de l'instance ETE 
		System.out.println(Saison.valueOf("ETE").getNom());
		
		// Utilisattion d'une méthode créée dans m'énumération pour récupérer l'objet dont le libellé est passé en paramètre
		System.out.println( Saison.recupSaison("Hiver"));
		System.out.println(Saison.HIVER.equals(Saison.recupSaison("Hiver")));
	}
}
