package fr.diginamic.operations;

import java.util.IllegalFormatCodePointException;

public class CalculMoyenne {
	double[] monTableauDeValeurs = new double[0];
	
	int      nbCases = 0;
	double   moyenne = 0;
	
	public void ajout(double valeur) {
		
		if (nbCases > monTableauDeValeurs.length -1)
		{
			double[] tabBean = new double[monTableauDeValeurs.length + 1];
			
			System.arraycopy(monTableauDeValeurs, 0, tabBean, 0, monTableauDeValeurs.length);
			tabBean[tabBean.length - 1] = valeur;
			monTableauDeValeurs = tabBean;
		}
		
		nbCases++;
	}
	// retourne la moyenne du tableau
	public double calcul() {
		for (int i = 0; i < monTableauDeValeurs.length; i++) {
			moyenne = moyenne + monTableauDeValeurs[i];
		}
		moyenne = moyenne / nbCases;
		return moyenne;
	}
}
