package com.kodnest.training.MathPow;

import java.util.Scanner;

public class MathSquareroot {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value");
		double d=scan.nextDouble();
		double result=Math.sqrt(d);
		System.out.println("square root of the value is " + " "+ result);
	}

}
