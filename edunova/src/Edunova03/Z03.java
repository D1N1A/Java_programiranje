package Edunova03;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		
		String grad = JOptionPane.showInputDialog("Unesi grad");
		
		switch (grad) {
		
		case "Osijek":
		
		System.out.println("Osječko-baranjska");
		break;
		
		case "Vukovar":
		System.out.println("Vukovarsko-srijemska");
		break;
		
		case "Virovitica":
		System.out.println("Virovitičko-posavska");
		break;
		
		case "Požega":
		System.out.println("Požeško-slavonska");
		break;
		
		
		}

	}

}
