package Edunova05;

import javax.swing.JOptionPane;

public class Z04ciklicnaMatrica {

	public static void main(String[] args){
		
		
		//Unos korisnika s if uvjetnim grananjem:
boolean dev = false;
		
		int red= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int stupac= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
			
			
		//dodavanje vrijednosti 
		
		int matrica [] [] = new int [red] [stupac];
		
		  int b = 1;
		  
		  int n = matrica[matrica.length-1] [0];
		  int l = matrica [0] [matrica.length-1];
		  int k=0;
		  int l=0;
		  
		 
		  
		  int rows = arr .length;
		    int cols = arr[0].length;
		  // Defining the boundaries of the matrix.
		  int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
		  
		  // Defining the direction in which the array is to be traversed.
		  int dir = 1;
		 
		  while (top <= bottom && left <= right) {

		    if (dir == 1) {    // moving left->right
		      for (int i = left; i <= right; ++i) {
		        System.out.print(arr[top][i] + " ");
		      }
		      // Since we have traversed the whole first
		      // row, move down to the next row.
		      ++top;
		      dir = 2;
		    } 
		    else if (dir == 2) {     // moving top->bottom
		      for (int i = top; i <= bottom; ++i) {
		          System.out.print(arr[i][right]+ " ");
		      }
		      // Since we have traversed the whole last
		      // column, move left to the previous column.
		      --right;
		      dir = 3;
		    } 
		    else if (dir == 3) {     // moving right->left
		      for (int i = right; i >= left; --i) {
		          System.out.print(arr[bottom][i]+ " ");
		      }
		      // Since we have traversed the whole last
		      // row, move up to the previous row.
		      --bottom;
		      dir = 4;
		    } 
		    else if (dir == 4) {     // moving bottom->up
		      for (int i = bottom; i >= top; --i) {
		          System.out.print(arr[i][left]+ " ");
		      }
		      // Since we have traversed the whole first
		      // col, move right to the next column.
		      ++left;
		      dir = 1;
		      
		    }
		  }