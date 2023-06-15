package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {

		String mjesto = JOptionPane.showInputDialog("Unesi mjesto");
		int y = Integer.parseInt(JOptionPane.showInputDialog("Dob"));
		
		System.out.println("Imam " + y + " god. i dolazim iz mjesta "	 + mjesto);

	}

}
