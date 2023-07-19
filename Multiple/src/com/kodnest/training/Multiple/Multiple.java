package com.kodnest.training.Multiple;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter numbers");
		int n=scan.nextInt();
		int num=scan.nextInt();
		checkMultipleOfTen(n,num);
	}
	public static void checkMultipleOfTen(int n,int num) 
	{
		if(n%num==0)
		{
			System.out.println(n+"  "+" is multiple of num "+num);
		}
		else
		{
			System.out.println(n+" "+ "is not multiple of num "+num);
		}
	}
}
