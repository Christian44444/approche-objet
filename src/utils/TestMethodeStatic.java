package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "12";
		int chaineEnEntier = java.lang.Integer.decode(chaine); // ou Integer.valueOf(chaine) ou Integer.parseInt(chaine)
		System.out.println(chaineEnEntier);
		int a = -8;
		int b = -3;
		System.out.println(java.lang.Integer.max(a, b));
		System.out.println(Integer.MAX_VALUE);
	}

}
