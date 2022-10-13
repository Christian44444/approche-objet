package fr.diginamic.essais;

import fr.diginamic.salarie.Pigiste;
import fr.diginamic.salarie.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie s1 = new Salarie("Durant", "Jean-Claud", 1724.27);
		Pigiste p1 = new Pigiste("Martin", "Sidonie", 19, 127.32);
		
		System.out.println(s1.getSalaire());
		System.out.println(p1.getSalaire());
		s1.afficherDonnees();
		p1.afficherDonnees();
		
	}

}
