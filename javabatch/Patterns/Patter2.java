package Patterns;

import java.util.Scanner;

public class Patter2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		/*for(int i=1;i<=rows;i++)
		 {
			for(int sp=rows-1;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		 }*/
		
		for(int i=1;i<=rows;i++)
		 {
			for(int sp=rows-1;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		 }


	}

}
