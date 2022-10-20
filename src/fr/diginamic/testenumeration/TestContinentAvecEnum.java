package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.Arrays;

import listes.Ville;

/**
 * Classe de test de l'énumération Continent
 * Lénumération étant rajoutée en exemple à la classe Ville du TP sur les listes
 * @author cmich
 *
 */
public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville v1 = new Ville(Continent.AMERIQUE,"New York",  3000000);
		Ville v2 = new Ville(Continent.EURASIE ,"Paris"   ,  1000000);
		Ville v3 = new Ville(Continent.EURASIE ,"Pékin"   , 10000000);
		Ville v4 = new Ville(Continent.EURASIE ,"Moscou"  ,  2000000);
		Ville v5 = new Ville(Continent.EURASIE ,"Berlin"  ,   900000);
		Ville v6 = new Ville(Continent.OCEANIE ,"Sydney"  ,   800000);
		Ville v7 = new Ville(Continent.AMERIQUE,"Sao Polo",  1400000);
		Ville v8 = new Ville(Continent.AFRIQUE ,"Dakar"   ,  5000000);
		
		ArrayList<Ville> listeVilles = new ArrayList<>();
		listeVilles.addAll(Arrays.asList(v1, v2, v3, v4, v5, v6, v7, v8));
		
		for (Ville v : listeVilles) {
			System.out.println(v);
		}

	}

}
