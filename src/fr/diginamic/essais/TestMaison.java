package fr.diginamic.essais;

import java.text.DecimalFormat;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maison m1 = new Maison();
		
		Chambre     ch1 = new Chambre(12.2, 1);
		m1.ajouterPiece(ch1);
		Chambre     ch2 = new Chambre(22.2, 2);
		m1.ajouterPiece(ch2);
		Chambre     ch3 = new Chambre(32.2, 3);
		m1.ajouterPiece(ch3);
		Chambre     ch4 = new Chambre(42.2, 4);
		m1.ajouterPiece(ch4);
		Cuisine     cu1 = new Cuisine(13.3, 0);
		m1.ajouterPiece(cu1);
		Salon       sa1 = new Salon  (14.4, 0);
		m1.ajouterPiece(sa1);
		SalleDeBain sB1 = new SalleDeBain(15.5, 0);
		m1.ajouterPiece(sB1);
		SalleDeBain sB2 = new SalleDeBain(25.5, 1);
		m1.ajouterPiece(sB2);
		WC          wc1 = new WC(16.6, 0);
		m1.ajouterPiece(wc1);
		WC          wc2 = new WC(26.6, -1);
		m1.ajouterPiece(wc2);
		WC          wc3 = new WC(36.6, 2);
		m1.ajouterPiece(null);
		WC          wc4 = new WC(-46.6, 3);
		m1.ajouterPiece(wc4);
		WC          wc5 = new WC(46.6, 4);
		m1.ajouterPiece(wc5);
		System.out.println("La superficie totale est de " + new DecimalFormat("0.00").format(m1.superficieMaison()));
		System.out.println("La superficie de l'étage 1 est de " + new DecimalFormat("0.00").format((m1.superficieEtage(1))));
		System.out.println("La surface des chambres est : " + new DecimalFormat("0.00").format(m1.superficieTypePiece(ch1)));
		System.out.println("Le nombre de WC est : " + m1.nombreTypePiece(wc1));
	}

}
