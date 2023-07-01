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

		
		int u = red*stupac;
		int d = u/stupac;
		int l = u/red;
		int b= 1;
		int c =0;
		int m = 1;
		int o = red/2;
		int p = stupac/2;
		
		
		int x= red;
		int y= stupac;
	
		
		int [] [] matrica = new int [red] [stupac];
		
		for (int k=1 ; k<=(x-1) ; k++) {
			for (int j=0 ; j<(y-1); j++) {
				for (int i=0 ; i<m ; i++) {
					matrica [p][o] = b++;
				}
					
					switch (u) {
					case 1:
						o=o-1;
						break;
						
					case 2:
						p=p-1;
						break;
						
					case 3:
						o=o+1;
						break;
						
					case 4:
						p=p+1;
						break;
						
					}
				}
			l=(u+1)%4;
			}
			m=m+1;
	
		matrica[0][y-1]=b;
		

		
		for (int i=0 ; i<x ; i++) {
			for (int j=0 ; j<y ; j++) {
				System.out.print(matrica[i] [j] + "\t ");
		}
			System.out.println();}
		
}
}

			
			

