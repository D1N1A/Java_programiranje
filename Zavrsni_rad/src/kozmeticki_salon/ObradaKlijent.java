package kozmeticki_salon;

import java.util.ArrayList;
import java.util.List;

import kozmeticki_salon_m.Klijent;

public class ObradaKlijent {
	
	private List<kozmeticki_salon_m.Klijent> klijenti;
	
	public List <Klijent> getKlijenti () {
		return klijenti;
	}
	
	public ObradaKlijent () {
		klijenti = new ArrayList <> ();
		if (Pomocno.dev) {
			testniPodaci ();
		}
	}
	
	private void testniPodaci () {
		klijenti.add(new kozmeticki_salon_m.Klijent(1, "Ana", "Anić", "0912345678", "ana.anic@mail.com"));
		klijenti.add(new kozmeticki_salon_m.Klijent(2, "Iva", "Ivić", "0923456789", "iva.ivic@gmail.com"));
		
		
	}
	
	public void prikaziIzbornik () {
		System.out.println("Klijent izbornik");
		System.out.println("1. Pregled uvedenih klijenata");
		System.out.println("2. Unos novog klijenta");
		System.out.println("3. Promjene na uvedenom klijentu");
		System.out.println("4. Brisanje uvedenog klijenta");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
		
	}
	
	private void ucitajStavkuIzbornika() {
		switch (Pomocno.unosRasponBroja("Odaberi stavku Klijent izbornika", "Odabir mora biti 1-5", 1, 5)) {
		
		case 1:
			pregledKlijenata();
			prikaziIzbornik();
			break;
			
		case 2:
			dodavanjeKlijenta();
			prikaziIzbornik();
			break;
			
		case 3:
			promjenaKlijenta();
			prikaziIzbornik();
			break;
			
		case 4:
			brisanjeKlijenta();
			prikaziIzbornik();
			break;
			
		case 5:
			break;
			
		}
			
		}
	
public void pregledKlijenata() {
	System.out.println("----------------------");
	System.out.println("-------Klijenti-------");
	System.out.println("----------------------");
	int b=1;
	for (Klijent k : klijenti) {
		System.out.println(b++ + ". " + k);
	}
	System.out.println("----------------------");
}

private void dodavanjeKlijenta() {
	Klijent k = new Klijent ();
	k.setIme(Pomocno.unosString("Unesi ime klijenta:", "Ime obavezno"));
	k.setPrezime(Pomocno.unosString("Unesi prezime klijenta:", "Prezime obavezno"));
	k.setKontakt_tel(Pomocno.unosString("Unesi kontakt telefon klijenta:", "Unos broja obavezan"));
	k.setE_mail(Pomocno.unosString("Unesi e-mail klijenta:", "Unos e-maila obavezan"));
	klijenti.add(k);
	
}

private void promjenaKlijenta() {
	pregledKlijenata ();
	Klijent k = klijenti.get(index-1);
	k.setIme(Pomocno.unosString("Unesi ime klijenta(" + k.getIme() + "):", "Ime obavezno"));
	k.setPrezime(Pomocno.unosString("Unesi prezime klijenta(" + k.getPrezime() + "):", "Prezime obavezno"));
	k.setKontakt_tel(Pomocno.unosString("Unesi kontakt telefon klijenta(" + k.getKontakt_tel() +"):", "Unos broja obavezan"));
	k.setE_mail(Pomocno.unosString("Unesi e-mail klijenta(" + k.getE_mail() +"):", "Unos e-maila obavezan"));


	
private void brisanjeKlijenta () {
	pregledKlijenata();
	int index = Pomocno.unosRasponBroja("Odaberi redni broj klijenta: ", "Nije dobar odabir", 1, polaznici.size());
}


		
	}

}
