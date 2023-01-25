package com.code.project;
import java.util.Scanner;
public class DEmo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		System.out.println("Enter Power");
		int power = sc.nextInt();
		int result = 1;
		
		for(int i = 1;i<=power;i++) {
			
			result = result*num;
		}
		System.out.println( "REsult is:   "+result);
	}

}
