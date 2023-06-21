package Edunova03;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		if (broj < 10) {
			System.out.println("Osijek");
		}
		else {
			System.out.println("Donji Miholjac");
	}
	}
}
