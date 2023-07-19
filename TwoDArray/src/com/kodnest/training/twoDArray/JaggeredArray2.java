package com.kodnest.training.twoDArray;
import java.util.Scanner;
public class JaggeredArray2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the 1 d elements");
		int arr[][]=new int[scan.nextInt()][];
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("enter the 2 d elements for 1 d elements");
		arr[i]=new int[scan.nextInt()];
	}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the name of game"+" "+ i + " "+ i+"player"+ " "+j);
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("enter the array contents are");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
