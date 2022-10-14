package listes;

import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> maListe = new ArrayList<>();
		maListe.add(-1);
		maListe.add(5);
		maListe.add(7);
		maListe.add(3);
		maListe.add(-2);
		maListe.add(4);
		maListe.add(8);
		maListe.add(5);
		System.out.println("Liste " + maListe);
		System.out.println("Taille " + maListe.size());
		Integer max = null;
		Integer mIn = null;
		
		for (Integer integer : maListe) {
			// Maximum
			if (max == null ) {
				max = integer;
			} else {
				max = max > integer ? max : integer;
//				if (max  < integer) {
//					max = integer;
//				}
			}
			// Minimum
			if (mIn == null ) {
				mIn = integer;
			} else {
				mIn = mIn > integer ? integer : mIn;
			}
		}
		System.out.println("Max " + max);
		maListe.remove(mIn);
		// Afficher la liste travaillée
		System.out.println(maListe);
		// Rechercher tous les éléments négatifs et les inversés
		for (int i = 0; i < maListe.size(); i++) {
			maListe.set(i, maListe.get(i) >= 0 ? maListe.get(i) : -1 * maListe.get(i));
		}
		System.out.println(maListe);	
		
	}

}
