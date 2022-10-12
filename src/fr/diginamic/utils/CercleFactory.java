package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory { //Classe Factory (usine) car elle crée un objet
	public static Cercle retourneCercle(double rayon) {
		return new Cercle(rayon);
	}
}
