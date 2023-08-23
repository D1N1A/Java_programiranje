package Edunova06;

import java.util.Scanner;



public class Kalkulator {
 
class Postotak
	{
		double per;
		Postotak(char[] arr1, char[] arr2)
		{
			double s1=0,s2=0;
			int n=0,i=0;
			for(char ch : arr1)
			{
				n=(int) arr1[i++];
				s1=s1+n;
			}
			i=0;
			for(char ch : arr2)
			{
				n=(int) arr2[i++];
				s2=s2+n;
			}
			if(s1<=s2)
				per=(s1/s2)*100;
			else
				per=(s2/s1)*100;	
		}
 
 
	} 

	
	public static void main(String args[])
		{
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Unesi svoje ime: ");
			String str1=sc.nextLine();
			System.out.println("Unesi ime svoje simpatije: ");
			String str2=sc.next();	
			char[] a1= str1.toCharArray();
			char[] a2= str2.toCharArray();
			Postotak p=new Postotak(a1,a2);
			System.out.println("Postotak zaljubljenosti je: "+Math.round(p.per));
		
			}
}
		





