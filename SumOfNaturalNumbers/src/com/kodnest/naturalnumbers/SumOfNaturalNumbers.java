package com.kodnest.naturalnumbers;
import java.util.Scanner;
public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("sum is"+sum);

	}

}
