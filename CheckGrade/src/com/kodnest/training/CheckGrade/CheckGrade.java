package com.kodnest.training.CheckGrade;

import java.util.Scanner;

public class CheckGrade {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the grade marks");
		int grade=scan.nextInt();
		checkGrade(grade);
		
	}
	public static void checkGrade(int grade)
	{
		if(grade>50)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
