package Edunova05;

import java.io.*;

import javax.swing.JOptionPane;

public class Z04ciklicnaMatrica {

	    public static void ciklicna(String m, String n)
	    {

	        int c[][] = new int[n][n];
	        for (int k = 0; k <= n - 1; k++)
	            c[k][0] = m[k];

	        for (int i = 1; i <= n - 1; i++) {
	            for (int j = 0; j <= n - 1; j++) {
	                if (j - 1 >= 0)
	                    c[j][i] = c[j - 1][i - 1];
	                else
	                    c[j][i] = c[n - 1][i - 1];
	            }
	        }
	 

	        for (int i = 0; i <= n - 1; i++) {
	            for (int j = 0; j <= n - 1; j++) {
	                System.out.print(c[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        String N = JOptionPane.showInputDialog("Unesi broj redaka: ");
	        String M = JOptionPane.showInputDialog("Unesi broj stupaca; ");
	        ciklicna(M, N);
	    }
	}

