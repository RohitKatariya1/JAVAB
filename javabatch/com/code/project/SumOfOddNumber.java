package com.code.project;
import java.util.Scanner;
public class SumOfOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = sc.nextInt();
		int sum = 0;
		for(int i =1;i<=num;i = i+2) {
			System.out.println(i); 
			sum = sum+i;
		}
		System.out.println(sum); 
	}

}
