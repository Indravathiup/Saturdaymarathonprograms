package com.kodnest.training.Methods.com;
import java.util.Scanner;
public class Methods {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter purchase amount");
		double purchaseAmount=scan.nextDouble();
		checkDiscount(purchaseAmount);
	}


public static void checkDiscount(double purchaseAmount)
{
	if(purchaseAmount>100) {
		System.out.println("Discount Applicable");
	}
	else
	{
		System.out.println("discount not applicable");
	}
}
}
