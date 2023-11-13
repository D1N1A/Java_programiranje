package Edunova04;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Manji broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Veći broj"));

		int a1 = 0;
		if (a1 > b) {
			int zamjenski = a1;
			a1 = b;
			b = zamjenski;
		}

		boolean prim = true;

		for (int i = a1; i <= b; i++) {
			prim = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prim = false;

				}
			}
			if (prim)
				System.out.println(i);
		}
	}
	
}

