package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		String paysPlusGrand = "";
		
		for (String string : set) {
			if (paysPlusGrand.length() <  string.length()) {
				paysPlusGrand = string;
			}
		}
		System.out.println(paysPlusGrand);
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			if (it.next().equals(paysPlusGrand)) {
				it.remove();
			}
		}
		for (String string : set) {
			System.out.println(string);
		}

	}

}
