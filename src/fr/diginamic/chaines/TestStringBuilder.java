package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long debut = System.currentTimeMillis();
		StringBuilder sB1 = new StringBuilder();
		for (int i = 1; i <= 100000; i++) {
			sB1.append(i);
		}
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en milisecondes : " + (fin - debut));
		
		long debut2 = System.currentTimeMillis();
		String s1 = "";
		for (int i = 1; i <= 100000; i++) {
			s1+=i;
		}
		long fin2 = System.currentTimeMillis();
		System.out.println("Temps écoulé en milisecondes : " + (fin2 - debut2));
		
		
	}

}
