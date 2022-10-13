package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Rectange;


public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle   c1 = new Cercle(10);
		Rectange r1 = new Rectange(10, 2);
		Carre    ca1 = new Carre(10);
		AffichageForme a1 = new AffichageForme();
		
		System.out.println(a1.afficher(c1));
		System.out.println(a1.afficher(r1));
		System.out.println(a1.afficher(ca1));
		
	}

}
