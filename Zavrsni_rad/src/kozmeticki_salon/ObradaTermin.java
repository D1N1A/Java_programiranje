package kozmeticki_salon;

import java.util.ArrayList;
import java.util.List;

import kozmeticki_salon_m.Termin;
import kozmeticki_salon_m.Klijent;
import kozmeticki_salon_m.Tretman;

public class ObradaTermin {
	
	private List <Termin> termini;


	
	public ObradaTermin() {
		termini = new ArrayList<>();
		
	}
	
	public void prikaziIzbornik() {
		System.out.println("\nTermin izbornik");
		System.out.println("1. Pregled postojećih termina");
		System.out.println("2. Unos novog termina");
		System.out.println("3. Promjena postojećeg termina");
		System.out.println("4. Brisanje postojećeg termina");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	
		
	}
	
	private void ucitajStavkuIzvornika() {
		switch(Pomocno.unosRasponBroja("Odaberi stavku izbornika termin:", "Odabir mora biti 1-5", 1, 5) ) {
		case 1:
			pregledTermin();
			prikaziIzbornik();
			break;
		case 2:
			dodavanjeTermina();
			prikaziIzbornik();
			break;
		case 3:
			promjenaTermin();
			prikaziIzbornik();
			break;
		case 4:
			brisanjeTermin();
			prikaziIzbornik();
			break;
		case 5:
			break;
		}
	}
	
	private void brisanjeTermin() {
		// TODO Auto-generated method stub
		
	}


	private void promjenaTermin() {
		// TODO Auto-generated method stub
		
	}


	private void pregledTermin() {
		
		System.out.println("----------------------");
		System.out.println("--------Termin--------");
		System.out.println("----------------------");
		int b=1;
		for (Termin t : termini) {
			System.out.println(b++ + ". " + t.getDatum + t.getVrijeme());
		}
		System.out.println("----------------------");
	}
	
	private void dodavanjeTermina() {
		Termin t = new Termin();
		t.setDatum(Pomocno.unosDatum("Unesi datum termina"));
		t.setVrijeme(Pomocno.unosVrijeme("Unesi u koliko sati je termin", "Obavezan unos vremena", 7.00, 21.00));
		t.setKlijenti(t.getKlijenti());
		t.setTretmani(t.getTretmani());
	
		
		
	}
	
	
	private void ucitajStavkuIzbornika() {
		// TODO Auto-generated method stub
		
	}



	}
	
	


		


