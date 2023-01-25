package com.code.project;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 400;
		 int count = 0;
		for(int i = 300;i<=n;i++) {
			if(n%i ==0) {
				count++;
			}
	
			if(count  == 2) {
				System.out.println( i+ "prime number");
			}
			else
			{
				System.out.println( i+" not prime number");

			}
		}
		
	}

}
