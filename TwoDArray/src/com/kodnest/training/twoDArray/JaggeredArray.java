package com.kodnest.training.twoDArray;
import java.util.Scanner;
public class JaggeredArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 1 d length");
		String arr[][]=new String[scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter 2d length for 1 d"+i);
				arr[i]=new String[scan.nextInt()];
			}
		scan.nextLine();
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter name of bank"+i+"customer"+j);
				arr[i][j]=scan.nextLine();
			}
		}
		System.out.println("array elements are");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println(arr[i][j]+ " ");
			}
			System.out.println();
	}
	}
}
