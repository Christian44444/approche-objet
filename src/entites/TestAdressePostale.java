package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 10;
		adr1.libelleRue = "rue du Daguenais";
		adr1.codePostal = 49100;
		adr1.ville = "Angers";
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 34;
		adr2.libelleRue = "rue du Croissant";
		adr2.codePostal = 44300;
		adr2.ville = "Nantes";
		
	}

}
