package kozmeticki_salon;

import java.util.Scanner;

public class Izbornik {

		private ObradaBiljeska obradaBiljeska;
		private ObradaKlijent obradaKlijent;
		private ObradaStanje obradaStanje;
		private ObradaTermin obradaTermin;
		private ObradaTretman obradaTretman;
		
		public Izbornik () {
			obradaBiljeska = new ObradaBiljeska ();
			obradaKlijent = new ObradaKlijent ();
			obradaStanje = new ObradaStanje ();
			obradaTermin = new ObradaTermin ();
			obradaTretman = new ObradaTretman ();
			pozdravnaPoruka();
			prikaziIzbornik();
			Pomocno.ulaz.close();
			
		}
		private void pozdravnaPoruka() {
			System.out.println("*************************************");
			System.out.println("*** Royal Swiss Beaury v 1.0 ***");
			System.out.println("*************************************");
		}
		
		private void prikaziIzbornik() {
			System.out.println("Glavni izbornik");
			System.out.println("1. Termin");
			System.out.println("2. Tretman");
			System.out.println("3. Klijent");
			System.out.println("4. Stanje");
			System.out.println("5. Bilješka");
			System.out.println("6. Izlaz iz programa");
			ucitajStavkuIzbornika();
		}
			
			private void ucitajStavkuIzbornika() {
				
				switch(Pomocno.unosRasponBroja("Odaberi stavku izbornika: ",
						"Obavezno 1-6",1,6)) {
				case 1:
					obradaTermin.prikaziIzbornik();
					prikaziIzbornik();
					break;
				case 2:
					obradaTretman.prikaziIzbornik();
					prikaziIzbornik();
					break;
				case 3:
					obradaKlijent.prikaziIzbornik();
					prikaziIzbornik();
					break;
				case 4:
					obradaStanje.prikaziIzbornik();
					prikaziIzbornik();
					break;
				case 5:
					System.out.println("Bilješka");
					break;
				case 6:
					System.out.println("Doviđenja");
					break;
					
						
				}
				
		}
			

	}

