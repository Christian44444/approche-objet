package fr.diginamic.salarie;

public class Salarie extends Intervenant {
	double mntSalaireMensuel;
	
	public Salarie(String nom, String prenom, double mntSalaireMensuel) {
		super(nom, prenom);
		this.mntSalaireMensuel = mntSalaireMensuel;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return mntSalaireMensuel;
	}

	@Override
	public String toString() {
		return "Salarie [Salaire mensuel=" + mntSalaireMensuel + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	

}
