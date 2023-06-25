package Edunova03;

import javax.swing.JOptionPane;

public class Z06 {

	public static void main(String[] args) {
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unos broja između 1 i 999"));
		
		if (broj < 1 || broj > 999) {
			System.out.println(broj + "pogrešan unos");
		} else {
			String brojevi = Integer.toString(broj);
			char br [] = brojevi.toCharArray();
			System.out.println(br[0]);
			
		 
		}

	}

}
