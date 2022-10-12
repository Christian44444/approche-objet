package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
	
	public static void main(String[] args) {
		Cercle c1 = new Cercle(12.0);
		Cercle c2 = new Cercle(24.0);
		System.out.println("Périmètres : c1 " +c1.permietre() + " c2 " + c2.permietre());
		System.out.println("Surfaces   : c1 " +c1.surface() + " c2 " + c2.surface());
		Cercle c3 = CercleFactory.retourneCercle(33);
		System.out.println("Cercle c3 créé par CercleFactory périmètre : " + c3.permietre() + " surface : " +c3.surface());
	}
}
