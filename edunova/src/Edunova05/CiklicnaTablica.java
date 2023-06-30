package Edunova05;

import javax.swing.JOptionPane;

public class CiklicnaTablica {
	

public static void main(String[] args) {
	//Unos dodatnih podataka radi lakšeg pisanja koda:
	
	int z = 5;
	int n = 1;
	
	//Unos korisnika s if uvjetnim grananjem:

		
	int red = 5 ;
	if (red<=z)
		red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
	else
		red = z;
	int stupac = 5;
	if (stupac<=z)
		stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca:"));
	else
		stupac = z;
		
		
	//Dvodimenzionalni niz:
	
		int [] [] matrica = new int [red] [stupac];
		matrica [4] [4] =n;
		matrica [4] [3]= n++;
		
		
	//Ugnježđivanje petlji:
		
		for (int i=0 ; i<red ; i++) {
			for (int j=0 ; j<stupac ; j++) {
				System.out.print(matrica[i] [j] + " ");
			}
			System.out.println();
		}
	
	//Dodavanje vrijednosti nizu:
	

		
		
}
}
		
