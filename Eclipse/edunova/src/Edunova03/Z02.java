package Edunova03;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		if (broj%2==0) {
			System.out.println("Broj je paran");
			
		} else {
			
			System.out.println("Broj je neparan");
		}
		
		

	}

}
