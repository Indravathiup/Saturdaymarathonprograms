package com.kodnest.training.MathPow;

import java.util.Scanner;

public class MathPow {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the base value");
		double base=scan.nextDouble();
		System.out.println("enter the exponent value");
		double exponent=scan.nextDouble();
		double result=Math.pow(base,exponent);
		System.out.println(base+" raised the power of" + " " + " " + exponent+" " +result);
	}

}
