package Edunova05;

import javax.swing.JOptionPane;

public class Z04ciklicnaMatrica {

	public static void main(String[] args){
		
		
		//Unos korisnika s if uvjetnim grananjem:
boolean dev = false;
		
		int red= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int stupac= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
			
			
		//dodavanje vrijednosti 
		
		
	    int[][] ciklicnaMatrica = new int[red][stupac];
	 
	    int d = (red*stupac)/2;
	 
	    int j;
	    int p=0;
	    
	    int m=red*stupac;
	    int n=m/stupac;
	    int o=m/red;
	    
	    int a=n/2;
	    int b=o/2;
	    
	    
	    int c = 0;
	 
	    for (int i = 0; i < m; i++) {
	      // do top side
	      for (j = a; j > p; j--) {
	       ciklicnaMatrica[i][i + j] = c--;
	      }
	 
	      // do right side
	      for (j = 1; j < b; j++) {
	        ciklicnaMatrica[i + j][d - 1 - i] = c++;
	      }
	 
	      // do bottom side
	      for (j = n; j > -1; j++) {
	        ciklicnaMatrica[d - 1 - i][i + j] = c++;
	      }
	 
	      // do left side
	      for (j = o; j > m; j--) {
	        ciklicnaMatrica[i + j][i] = c--;
	      }
	 
	    }
	}
}
	 
	    // ispis ciklične matrice



