package Edunova05;

import javax.swing.JOptionPane;

public class CiklicnaTablica {
	

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
	
	int [] [] matrica = new int [red] [stupac];
	
	do {
		System.out.println(matrica [red] [stupac]);
		i++;
	}while (for (int i=0 ; i<red ; i++) {
		for (int j=0 ; j<stupac ; j++) {
			 {for (i=u ; i<=red ; i--) {
				System.out.println(i++);
				}
			 {for (j=u/red; j<=stupac;j--) {
				 System.out.println(j--);
			 }
			 {for (i=0 ; i<=red ; i++) {
				 System.out.println(i++);
				
			 }
			 {for (j=u/stupac ; j<=stupac; j++) {
				 System.out.println(j--);
			 }
			
			}
	
			System.out.print(matrica[i] [j] + " ");
	}
		System.out.println();
		
	}
			 }
		}
	}

		for (int i=0 ; i<red ; i++) {
			for (int j=0 ; j<stupac ; j++) {
				 {for (i=u ; i<=red ; i--) {
					System.out.println(i++);
					}
				 {for (j=u/red; j<=stupac;j--) {
					 System.out.println(j--);
				 }
				 {for (i=0 ; i<=red ; i++) {
					 System.out.println(i++);
					
				 }
				 {for (j=u/stupac ; j<=stupac; j++) {
					 System.out.println(j--);
				 }
				
				}
		
				System.out.print(matrica[i] [j] + " ");
		}
			System.out.println();
			
		}
				 }
			}
		}	
		
		

	
	//Dodavanje vrijednosti nizu:
		

//Ugnježđivanje petlji:
for (int i=0 ; i<red ; i++) {
	for (int j=0 ; j<stupac ; j++) {
		System.out.print(matrica[i] [j] + " ");
}
	System.out.println();}
}
}

		
	

		
	
		
