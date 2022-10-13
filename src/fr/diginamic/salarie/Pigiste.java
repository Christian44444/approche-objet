package fr.diginamic.salarie;

public class Pigiste extends Intervenant {
	int NbJourTravailleMois;
	double mntRemunerationJour;
	
	public Pigiste(String nom, String prenom, int nbJourTravailleMois, double mntRemunerationJour) {
		super(nom, prenom);
		NbJourTravailleMois = nbJourTravailleMois;
		this.mntRemunerationJour = mntRemunerationJour;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return NbJourTravailleMois * mntRemunerationJour;
	}

	@Override
	public String toString() {
		return "Pigiste [Nombre de jours travaillés dans le mois=" + NbJourTravailleMois + ", montant de la rémunération jour=" + mntRemunerationJour
				+ ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
