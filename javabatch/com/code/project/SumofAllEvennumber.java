package com.code.project;

import java.util.Scanner;

public class SumofAllEvennumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Even Number");
		int sum =0;
		int n  =sc.nextInt();
		for(int i =1;i<=n;i++) 
		{
		System.out.println(i);
		 sum = sum+i;
		}
		System.out.println(sum);
	 	}
    }

