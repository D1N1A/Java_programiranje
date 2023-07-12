package Edunova05;

import javax.swing.JOptionPane;

public class Z04ciklicnaMatrica {
static void matric(int x, int y, int matrica [][])  {

	int b=1;
	
	  int x=0;
	  int y=0;
	  i=1;
	  
	  while (x < z && y < w) 	
	  
	  {for (int i z= ; i < w; --i) {
          matrica[i][w - 1] = b++;
      }
      w--;

     
      if (y < z) {
          for (int i = w - 1; i >= y; --i) {
              matrica[z - 1][i] = b++;
          }
          z--;
      }

   
      if (y < w) {
          for (int i = z - 1; i >= y; --i) {
              matrica[i][y] = b++;
          }
          b++;
      }
  }
}
	

public static void main(String[] args) {
	//Unos korisnika s if uvjetnim grananjem:
	
	boolean dev = false;
	
	int red= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
	int stupac= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		
		
	//dodavanje vrijednosti 
	

    int cmatrica[][] = new int[red][stupac];
    matric(z, w, matrica);
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(matrica[i][j] + " ");
        }
        System.out.println("");
    }
}

	
}	
