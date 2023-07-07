package Edunova05;

import javax.swing.JOptionPane;

public class Z04ciklicnaMatrica {

	public static void main(String[] args){
		
		
		//Unos korisnika s if uvjetnim grananjem:
boolean dev = false;
		
		int red= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int stupac= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
			
			
		//dodavanje vrijednosti 
		
		int matrica [] [] = new int [red] [stupac];
		
		  int b = 1;
		  
		  int x=0;
		  int y=0;
		  int z=red-1;
		  int w=stupac-1;
		  
		  
			  
			  for (int i=z;i<=x;i--)
				  matrica [z][i]=b++;
			  		z--;
			  for (int i=x;i<=y;i--)
				  matrica [i][x]=b++;
			  		w--;
			  for (int i=x;i>=z;i++)
			  	  matrica [y][i]=b++;
			  		x++;
			  for (int i=y;i>=w;i++)
				  matrica [i][w]=b++;
			  		y++;
		  
				  
			  
			  
			
		
		  
		  
		  
			for (int i = 0; i < red; i++) {
				for (int j = 0; j < stupac; j++) {
					System.out.print(matrica[i][j] + "\t");
				}
				
				System.out.println();
				
			}
			
			
			
	}
	
	
}