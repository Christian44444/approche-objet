import fr.diginamic.testenumeration.Continent;
import listes.Ville;

public class TestsDivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville v = new Ville(Continent.AFRIQUE, "Naerobi", 4500000);
		Ville ville = new Ville(Continent.AFRIQUE, "Naerobi", 4500000);
		System.out.println(v.compareTo(ville));
		
	}

}
