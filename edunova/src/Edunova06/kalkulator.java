package Edunova06;

import java.util.Scanner;



public class Kalkulator {
 
static class Postotak
	{
		double per;
		Postotak(char[] ime1, char[] ime2)
		{
			double i1=0,i2=0;
			int b=0,i=0;
			for(char ch : ime1)
			{
				b=(int) ime1[i++];
				i1=i1+b;
			}
			i=0;
			for(char ch : ime2)
			{
				b=(int) ime2[i++];
				i2=i2+b;
			}
			if(i1<=i2)
				per=(i1/i2)*100;
			else
				per=(i2/i1)*100;	
		}
 
 
	} 

	
	public static void main(String args[])
		{
	
			Scanner sc=new Scanner(System.in);{
			System.out.println("Unesi svoje ime: ");
			String Ime1=sc.nextLine();
			System.out.println("Unesi ime svoje simpatije: ");
			String Ime2=sc.next();	
			char[] i1= Ime1.toCharArray();
			char[] i2= Ime2.toCharArray();
			sc.close();
			Postotak p=new Postotak(i1,i2);
			System.out.println("Postotak zaljubljenosti je: "+Math.round(p.per));
		
			}
		}
	}
		





