package Edunova05;

import javax.swing.JOptionPane;

public class CiklicnaTablica {

	public static void main(String[] args) {
		
		//Unos korisnika:
		
		int redovi = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova:"));
		int stupci = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca:"));
		
		// Dvodimenzionalni niz:
		
		int tablica [] [] = new int [redovi] [stupci];
				
				
	// Ugnježđivanje petlje (for):
		
		for (int i=0; i<redovi ; i++) {
			for (int j=0 ; j<stupci ; j++) {
				System.out.println(tablica[i][j] + "  ");
			}
			System.out.println();
		}
			}
			
	}
