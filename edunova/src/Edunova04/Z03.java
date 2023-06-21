package Edunova04;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		int broj;
		
		for (;;) {
			broj=Integer.parseInt(JOptionPane.showInputDialog("Broj"));
			if (broj>=1 || broj <=10) {
				break;}
			}
		System.out.println("nije dobar");
		System.out.println(broj);
	}


	
}
