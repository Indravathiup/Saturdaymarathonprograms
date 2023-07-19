package com.kodnest.training.Prime;
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		if(num<2)
		{
			System.out.println("not a prime");
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("prime");
					
	}
	}



