package kozmeticki_salon;

import java.util.ArrayList;
import java.util.List;

import kozmeticki_salon_m.Stanje;

public class ObradaStanje {
	
	private List <Stanje> stanja;
	
	public List<Stanje> getStanja() {
		return stanja;
	}

	public ObradaStanje () {
		stanja = new ArrayList <> ();
		if(Pomocno.dev) {
			testniPodaci ();
		}
	}

	private void testniPodaci() {
	stanja.add(new Stanje(1, "hašimoto", "hipotireoza"));
	stanja.add(new Stanje(2, "zdrava", null));
	}
	
	private void prikaziIzbornik () {
		System.out.println("\nStanje izbornik");
		System.out.println("1. Pregled postojećih stanja");
		System.out.println("2. Unos novog stanja");
		System.out.println("3. Promjena postojećeg stanja");
		System.out.println("4. Brisanje postojećeg stanja");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzvornika();
	}
	private void ucitajStavkuIzbornika() {
		switch(Pomocno.unosRasponBroja("Odaberi stavku izbornika stanja", "Odabir mora biti 1-5", 1, 5)) {
		case 1:
			pregledStanja ();
			prikaziIzbornik();
			break;
		case 2:
			dodavanjeStanja();
			prikaziIzbornik();
			break;
		case 3:
			promjenaStanja();
			prikaziIzbornik();
			break;
		case 4:
			brisanjeStanja();
			prikaziIzbornik();
			break;
		case 5:
			break;
		}
	}
	
	public void pregledStanja() {
		System.out.println("----------------------");
		System.out.println("--------Stanja--------");
		System.out.println("----------------------");
		int b=1;
		for(Stanje s: stanja) {
			System.out.println(b++ + ". " + s.getNaziv());
		}
		System.out.println("----------------------");
			
		}
	
	private void dodavanjeStanja () {
	Stanje s = new Stanje ();
	s.setSifra(Pomocno.unosRasponBroja("Unesi šifru stanja:", "Pozitivan broj", 1, Integer.MAX_VALUE));
	s.setNaziv(Pomocno.unosString("Unesi naziv stanja:", "Naziv obavezan"));
	s.setOpis(Pomocno.unosString("Unesi opis stanja:", "Opis obavezan"));
	stanja.add(s);
	}
	
	private void promjenaStanja() {
		pregledStanja();
		int index = Pomocno.unosRasponBroja("Odaberi redni broj stanja;", "Nije dobar odabir", 1, stanja.size());
		Stanje s = stanja.get(index-1);
		s.setSifra(Pomocno.unosRasponBroja("Unesi šifru stanja(" + s.getSifra() + "):", "Pozitivan broj", 1, Integer.MAX_VALUE));
		s.setNaziv(Pomocno.unosString("Unesi naziv stanja (" + s.getNaziv() + "):", "Naziv obavezan"));
		s.setOpis(Pomocno.unosString("Unesi opis stanja (" + s.getOpis() + "):", "Opis obavezan"));
		
	}
	
	private void brisanjeStanja () {
		pregledStanja ();
		int index = Pomocno.unosRasponBroja("Odaberi redni broj stanja:", "Nije dobar odabir", 1, stanja.size());
		stanja.remove(index-1);
	}
}
