package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adr1 = new AdressePostale(10,"rue du Daguenais",49100,"Angers");
//		adr1.numeroRue = 10;
//		adr1.libelleRue = "rue du Daguenais";
//		adr1.codePostal = 49100;
//		adr1.ville = "Angers";
		
		AdressePostale adr2 = new AdressePostale(34,"rue du Croissant",44300,"Nantes");
//		adr2.numeroRue = 34;
//		adr2.libelleRue = "rue du Croissant";
//		adr2.codePostal = 44300;
//		adr2.ville = "Nantes";
		System.out.println(adr1.numeroRue + " TAP");
		System.out.println(adr2.numeroRue + " TAP");
	}

}
