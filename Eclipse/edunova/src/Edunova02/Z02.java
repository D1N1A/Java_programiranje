package Edunova02;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Djeljenik"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Djelitelj"));
		
		System.out.println(a/(float)b);

	}

}
