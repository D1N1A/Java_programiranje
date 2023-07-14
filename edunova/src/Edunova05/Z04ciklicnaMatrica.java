package Edunova05;
import java.util.*;
import javax.swing.JOptionPane;

public class Z04ciklicnaMatrica {
	



public static void main(String[] args) {
	//Unos korisnika s if uvjetnim grananjem:
	
	boolean dev = false;

	int red= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
	int stupac= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
	
	int  matrica [][] = new int [red] [stupac];
	
	int x = 0;
	int z = red-1;
	int y = 0;
	int w = stupac-1;
	int b = 1;

	while (x<=z && y<=w) {
	if (b==1) {
		for (int i=w; i>=y; --i) {
			System.out.println(matrica[z][i] + " ");
		}
		--z;
		b=4;
	}
		
		else if (b==2) {
		for (int i=z; i>=x; --i) {
			System.out.println(matrica[i][y] + "  ");
		}
		++y;
		b=1;
		}
		
		else if (b ==1) {
			for (int i = y ; i<=w; ++i) {
				System.out.println(matrica[x][y] + "  ");
			}
			++z;
			b=2;
		}
		else if (b==2) {
			for (int i=x ; i<=z;++i) {
				System.out.println(matrica[i][w]+ "  ");
				
			}
			--w;
			b = 3;
		}
		
	}

	
	for (int i = 0; i < red; i++) {
		for (int j = 0; j < stupac; j++) {
			System.out.print(matrica[i][j] + "\t");
		}
		
		System.out.println();

	
}	
}
}

