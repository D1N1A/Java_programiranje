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
		tretmani = new ArrayList <>() {
		}
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
	}

	public ObradaTretman() {
		// TODO Auto-generated constructor stub
	}

}
