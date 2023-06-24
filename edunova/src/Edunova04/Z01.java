package Edunova04;

import javax.swing.JOptionPane;

public class Z01 {

	private static final int Drugi = 0;

	public static void main(String[] args) {
		int pb = Integer.parseInt(JOptionPane.showInputDialog("Prvibroj"));
		int db = Integer.parseInt(JOptionPane.showInputDialog("Drugi broj"));
		
		
		int manji = pb < db ? pb : db ;
		int veci = pb < db ? pb : db;
		
		int zbroj=0;
		
		
		for(int i=manji;i<=veci;i++) {
			zbroj = i % 2 != 0 ? zbroj + i : zbroj;
			if (i%2!=0) {
				zbroj+=i;
			}
		}
		System.out.println(zbroj);
	}

}
