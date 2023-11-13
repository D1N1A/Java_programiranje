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
			prikaziIzbornik();
			break;
		case 2:
			dodavanjeTretman();
			prikaziIzbornik();
			break;
		case 3:
			promjenaTretman();
			prikaziIzbornik();
			break;
		case 4:
			brisanjeTretmana();
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
		Tretman t = new Tretman ();
		t.setSifra(Pomocno.unosRasponBroja("Unesi šifru tretmana:", "Pozitivan broj", 1, Integer.MAX_VALUE));
		t.setNaziv(Pomocno.unosString("Unesi naziv tretmana:", "Pogrešan unos"));
		t.setCijena(Pomocno.unosFloat("Unesi cijenu:", "Pogrešan unos"));
		
	}
	
	
	private void promjenaTretman() {
		pregledTretmana();
		int index = Pomocno.unosRasponBroja("Odaberi redni broj tretmana", "Nije dobar odabir",1, tretmani.size());
		Tretman t = tretmani.get(index-1);
		t.setSifra(Pomocno.unosRasponBroja("Unesi šifru tretmana (" + t.getSifra() + "): ", "Pozitivan broj", 1, Integer.MAX_VALUE));
		t.setNaziv(Pomocno.unosString("Unesi naziv tretmana (" + t.getNaziv() + "): ", "Naziv obavezan"));
		t.setCijena(Pomocno.unosFloat("Unesi cijenu (" + t.getCijena() + "): ", "Pogrešan unos"));
	}
		
	private void brisanjeTretmana () {
		pregledTretmana();
		int index = Pomocno.unosRasponBroja("Odaberi redni broj tretmana", "Nije dobar odabir", 1, tretmani.size());
		tretmani.remove(index-1);
	}
		




	private void pregledTretmana() {
		// TODO Auto-generated method stub
		

	}

}
