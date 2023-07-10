package Edunova05;

import javax.swing.JOptionPane;

public class Z04ciklicnaMatrica {

public static void main(String[] args) {
	//Unos korisnika s if uvjetnim grananjem:
	
	boolean dev = false;
	
	int red= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
	int stupac= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		
		
	//dodavanje vrijednosti 
	
	int matrica [] [] = new int [red] [stupac];
	
	  int b = 1;
	  int u = red*stupac;
	  
	  int x=0;
	  int y=0;
	  int z=red-1;
	  int w=stupac-1;
	  
	  
	  
while(y<=z)	  {
	  for (int i=w;i<=y;i--)
		  matrica [z][i]=b++;
	  		z--;
	  for (int i=z;i<=x;i--)
		  matrica [i][y]=b++;
	  		y--;
	  for (int i=y;i>=w;i++)
	  	  matrica [x][i]=b++;
	  		x++;
	  for (int i=x;i>=z;i++)
		  matrica [i][w]=b++;
	  		w++;		  
}

  
for (int i = 0; i < red; i++) {
	for (int j = 0; j < stupac; j++) {
		System.out.print(matrica[i][j] + "\t");
	}
	
	System.out.println();
	
}
}
}
}
}		
