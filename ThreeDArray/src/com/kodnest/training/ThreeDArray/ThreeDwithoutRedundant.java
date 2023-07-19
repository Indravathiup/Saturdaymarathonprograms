package com.kodnest.training.ThreeDArray;
import java.util.Scanner;
public class ThreeDwithoutRedundant {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 1D length");
	int arr[][][]=new int[scan.nextInt()][][];	
	System.out.println("enter 2d length for every 1D");
	//for(int i=0;i<=arr.length-1;i++)
	//{
		//System.out.println("enter 2d length for 1 d"+i);
		//arr[i]=new int[scan.nextInt()][];
	//}
	System.out.println("enter 3D length for every 1D&2D");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("enter 2d length for 1 d"+i);
		arr[i]=new int[scan.nextInt()][];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("enter 3d length for 1 D"+i+"2D"+j);
			arr[i][j]=new int[scan.nextInt()];
		}
	
	}
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println("enter marks of school"+i+"class"+j+"student"+k);
				arr[i][j][k]=scan.nextInt();			}
		}
	
	}
	System.out.println("array contents are");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.print(arr[i][j][k]+" ");
				
			}
			System.out.println();
			
		}
		System.out.println("--------");
	}
	}

}
