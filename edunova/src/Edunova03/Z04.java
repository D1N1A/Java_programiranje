package Edunova03;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		int prvi = Integer.parseInt(JOptionPane.showInputDialog("PrviBroj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Drugi broj"));
		
		if (prvi>drugi) { 
			System.out.println(prvi);
		} else if (drugi>prvi) {
			System.out.println(drugi);
		}

	}

}
