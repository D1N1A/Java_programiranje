package kozmeticki_salon;

import java.util.ArrayList;
import java.util.List;

import kozmeticki_salon_m.Tretman;


public class ObradaTretman {

	
	private List <Tretman> tretmani;
	private Izbornik izbornik;
	
	public ObradaTretman (Izbornik izbornik) {
		this ();
		this.izbornik = izbornik;
	}
	public ObradaTretman() {
		tretmani = new ArrayList <>();
		}
	
	
	public void prikaziIzbornik () {
		System.out.println("\nTretman izbornik");
		System.out.println("1. Pregled postojećih tretmana");
		System.out.println("2. Unos novog tretmana");
		System.out.println("3. Promjena postojećeg tretmana");
		System.out.println("4. Brisanje postojećeg tretmana");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
		
			
		}

	private void ucitajStavkuIzbornika () {
		switch(Pomocno.unosRasponBroja("Odaberi stavku izbornika tretman", "Odabit mora biti 1-5",	1,	5)) {
		case 1:
			pregledTretman ();
			prikaiIzbornik();
			break;
		case 2:
			dodavanjeTretman();
			prikaziIzbornik();
			break;
		case 3:
			promjenaTretman();
			prikaziizbornik();
			break;
		case 4:
			brisanjeTretman();
			prikaziIzbornik();
			break;
		case 5:
			break;
		}
	}
	
	private void pregledTretman () {
		System.out.println("----------------------");
		System.out.println("--------Tretman-------");
		System.out.println("----------------------");
		int b=1;
		for (Tretman t : tretmani) {
			System.out.println(b++ + ". " + t.getNaziv());
		}
		System.out.println("----------------------");
		}
	
	private void dodavanjeTretman () {

	public ObradaTretman() {
		// TODO Auto-generated constructor stub
	}

}
