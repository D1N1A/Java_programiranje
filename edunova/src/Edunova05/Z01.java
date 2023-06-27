package Edunova05;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {
		
	
	int broj; 
	do {
		broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		if(broj>=20 && broj<=50 && broj!=30) {
			break;
			
		}
		JOptionPane.showMessageDialog(null, "Nije dobro");
	}while(true);
	System.out.println(broj);
}

}
