package Edunova05;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
	
		int prviBroj;
		int drugiBroj;
		
		do {
			prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj:"));
			
		if (prviBroj>=20&&prviBroj<=80) {
			break;
		}
		}while (true);
		do {
			drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj:"));
			if (drugiBroj>=20 && drugiBroj<=80) {
				break;
			}
		}while (true);
		int manji = prviBroj<drugiBroj ? prviBroj:drugiBroj;
		int veci = prviBroj>drugiBroj ? drugiBroj:prviBroj;
		
		int broj=veci;
		
		do {
			if (broj%2==1) {
				System.out.println(broj);
			}
		}while (--broj>=manji);
		
	}
		
}	