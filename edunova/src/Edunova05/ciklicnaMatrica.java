package Edunova05;

import javax.swing.JOptionPane;

public class ciklicnaMatrica {



	public static void main(String[] args) {
		//Unos dodatnih podataka radi lakšeg pisanja koda:
		
		int z = 5;
		
		
		
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
				
		int m = red*stupac;
		
		int a = m/stupac;
		int b = m/red;
		int c=0;
		
		int n = 1;
		int i=1;
		
		for (int i=m/a ; i= b ; n++) {
			matrica [red] [stupac-b]=n++; 
		break; {
		
			for (int i=b ; i=c ;n++) {
				matrica [red-b] [stupac]=n++;
				
			break; {
				
				for (int i=c; i=m; n++) {
					matrica [red] [stupac-b]= n++;
				break;
				{
					for (int i=a ; i=m ; n++) {
						matrica [red+a] [stupac+b]=n++;
						break;
					}
				}
			}
				
	
		
		
		
		
		
		
		
		
		for (int i=0 ; i<red ; i++) 
			for (int j=0 ; j<stupac ; j++) {
				System.out.print(matrica[i] [j] + "\t ");
			}
			System.out.println() ;
			}
			}
			
			

