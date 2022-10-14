package listes;

import java.util.ArrayList;
import java.util.Iterator;


public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> maListe = new ArrayList<>();
		maListe.add("Nice");
		maListe.add("Carcassonne");
		maListe.add("Narbonne");
		maListe.add("Lyon");
		maListe.add("Foix");
		maListe.add("Pau");
		maListe.add("Marseille");
		maListe.add("Tarbes");
		
		Integer plusLong = null;
		String  plusLongVille = new String();
		
		for (String string : maListe) {
			if (plusLong==null) {
				plusLong = string.length();
				plusLongVille = string;
			}
			plusLong = plusLong > string.length() ? plusLong : string.length();
			plusLongVille = plusLong > string.length() ? plusLongVille : string;
		}
		System.out.println(plusLongVille);
		
		for (int i = 0; i < maListe.size(); i++) {
			maListe.set(i, maListe.get(i).toUpperCase());
		}
		System.out.println(maListe);
		
		Iterator<String> it = maListe.iterator();
		while (it.hasNext()) {
			String string = it.next();
			if (string.charAt(0) == 'N') {
				it.remove();
			} 
		}
		System.out.println(maListe);
	}

}
