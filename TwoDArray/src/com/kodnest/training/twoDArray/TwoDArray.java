package com.kodnest.training.twoDArray;
import java.util.Scanner;
public class TwoDArray{
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int arr[][]=new int[2][5];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the marks" + i +"students"+ j);
			
				arr[i][j]=scan.nextInt();
				}
		}
		System.out.println("array contents are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
}
}
}