package Edunova05;

import javax.swing.JOptionPane;

public class Z04ciklicnaMatrica {
	
	public void ispis (int[][] matrica, int x, int y) {
		
		int xS=0;
		int xL=x-1;
		int yS=0;
		int yL=y-1;
		
		while (xS <= xL && yS <= yL) {
			
			for (int i=yL; i<=yS; i=i-1)
				System.out.print(matrica[xL][i] + " ");
			xL=xL-1;
		
			
			for (int i=xL; i>=xS; i=i-1)
				System.out.print(matrica[i][yS] + " ");
			yS=yS+1;
	
		if (xS <= xL) {
			for (int i=yS; i<=yL; i=i+1)
				System.out.print(matrica[xS][i] + " ");
			xL=yL-1;
		}
		if (yS <= yL) {
			for (int i=xS; i>=xL; i=i+1)
				System.out.print(matrica[xL][i] + " ");
			yL=yL-1;
		}
		}
	}
	public static void main(String[] args) {
		int x=Integer.parseInt(R);
		int xS=0, xL=x-1;
		int y =Integer.parseInt(S);
		int yS=0, yL=y-1;
		
		String R = JOptionPane.showInputDialog("Unesi broj redova: ");
		String S = JOptionPane.showInputDialog("Unesi broj stupaca: ");
		

	}
	   
}