package Edunova07;


public class Z02 {

	public static void main(String[] args) {
		
Racunalo [] racunala = new Racunalo [2];
		
		racunala [0] = new Racunalo("Ana", 2019);
		racunala [1] = new Racunalo("Bruno", 2021);
		
		for (Racunalo r: racunala) {
			System.out.println(r.getKorisnik() + "  _  " + r.getGodinaProizvodnje());
		}
		

	}

}
