package listes;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test equals() en @Override
		Ville ve1 = new Ville("La Baule", 44500);
		Ville ve2 = new Ville("La Baule", 44500);
		
		System.out.println(ve1.equals(ve2)); // Return true
		 
		Ville ve3 = new Ville("La Baules", 44500);
		Ville ve4 = new Ville("La Baule", 44500);
		System.out.println(ve3.equals(ve4)); // Return false
		
		System.out.println(ve1 == ve2);
		System.out.println(ve3 == ve4);
		// Comment faire pour que == retourne true
		ve1 = ve2;
		System.out.println(ve1 == ve2);
	}

}
