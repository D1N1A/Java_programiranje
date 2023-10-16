package kozmeticki_salon;

import java.util.ArrayList;
import java.util.List;

import kozmeticki_salon_m.Biljeska;
import kozmeticki_salon_m.Termin;
import kozmeticki_salon_m.Tretman;

public class ObradaBiljeska{
	
	private List <Biljeska> biljeske;
	
	public ObradaBiljeska () {
		biljeske= new ArrayList<>();
		if (Pomocno.dev) {
			testniPodaci();
		}
		}
	
	private void testniPodaci () {
		biljeske.add(new Biljeska(1, "dermatitis", "LaRochePosay", 1, 1));
		biljeske.add(new Biljeska(1, "akne", "Dalton", 2, 2));
	} 
	public  prikaziIzbornik() {
		System.out.println("Biljeska izbornik");
		System.out.println("1. Pregled postojećih bilješki");
		System.out.println("2. Unos nove bilješke");
		System.out.println("3. Promjena postojeće bilješke");
		System.out.println("4. Brisanje postojeće bilješke");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	
	}
	
	private void ucitajStavkuIzbornika() {
		
		public void prikaziIzbornik() {
			System.out.println("Bilješka izbornik");
			System.out.println("1. Pregled postojećih bilješki");
			System.out.println("2. Unos novoe bilješke");
			System.out.println("3. Promjena postojeće bilješke");
			System.out.println("4. Brisanje postojeće bilješke");
			System.out.println("5. Povratak na prethodni izbornik");
			ucitajStavkuIzbornika();
		}
		
		private void ucitajStavkuIzbornika() {
			switch(Pomocno.unosRasponBroja("Odaberi stavku bilješka izbornika: ",
					"Odabir mora biti 1-5", 1, 5)) {
			case 1:
				pregledBilješki();
				prikaziIzbornik();
				break;
			case 2:
				dodavanjeBilješki();
				prikaziIzbornik();
				break;
			case 3:
				promjenaBilješki();
				prikaziIzbornik();
				break;
			case 4:
				brisanjeBilješki();
				prikaziIzbornik();
				break;
			case 5:
				break;
			}
		}

		public void pregledPredavaca() {
			System.out.println("-------------------");
			System.out.println("---- Bilješke ----");
			System.out.println("-------------------");
			int b=1;
			for(Biljeska b : biljeske) {
				System.out.println(b++ + ". " + b);
			}
			System.out.println("-------------------");
			
		}

		private void dodavanjeBiljeske() {
			Biljeska b = new Biljeska();
			b.setSifra(Pomocno.unosRasponBroja("Unesi šifru smjera: ","Pozitivan broj",
					1,Integer.MAX_VALUE));
			b.setOpažanje(Pomocno.unosString("Unesi opažanje: ", "Unos opažanja obavezan"));
			b.setPreporuka(Pomocno.unosString("Unesi preporuku:", "Unos prekoruke obavezan"));
			biljeske.add(b);
			
		}
		
		
		private void promjenaBiljeske() {
			pregledBiljeski();
			int index = Pomocno.unosRasponBroja("Odaberi redni broj bilješke", "Nije dobar odabir", 1, biljeske.size());
			Biljeska b = biljeske.get(-1);
			b.setSifra(Pomocno.unosRasponBroja("Unesi šifru smjera: (" + b.getSifra() + "): ","Pozitivan broj",
					1,Integer.MAX_VALUE));
			b.setOpažanje(Pomocno.unosString("Unesi opažanje: (" +b.getOpažanje() + ")", "Unos opažanja obavezan"));
			b.setPreporuka(Pomocno.unosString("Unesi preporuku: (" +b.getPreporuka() + ")", "Unos prekoruke obavezan"));
			}
		
		private void brisanjePredavaca() {
			pregledBiljeski();
			int index = Pomocno.unosRasponBroja("Odaberi redni broj bilješke: ","Nije dobar odabir",1,biljeske.size());
			biljeske.remove(index-1);
			
		}

	

}
