package Edunova06;

import java.util.Scanner;


public class kalkulator {

	public static void main(String[] args) {
		double sum1=0,sum2=0,postotak;
		Scanner sc=new Scanner(System.in);
		System.out.println("Vaše ime :");
		String s1=sc.nextLine();
		System.out.println("Ime vaše simpatije: ");
		String s2=sc.next();
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		int b=0, i=0;
		for (char ch : arr1)
		 {
			b=(int) arr1[i++];
			sum1=sum1+b;
		 }
	
		i=0;
		for(char ch : arr2)
		 {
			b=(int) arr2[i++];
			sum2=sum2+b;
		 }
	if (sum1<=sum2)
		postotak=(sum1/sum2)*100;
	else
		postotak=(sum2/sum1)*100;
	System.out.println("Postotak zaljubljenosti je = "+postotak);
		
	}
	
}

