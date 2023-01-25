package com.code.project;
import java.util.Scanner;
public class FibSeries {

	public static void main(String[] args) {
		
	        int a = 0,b = 1, c,num;

	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter your number");
		          num = sc.nextInt();

		          System.out.println("fib series");

		        for(int i = 1;i<=num;i++){
		            c = a+b;
		            a = b;
		            b = c;

		            System.out.println(" "+a);

		        }
		    }
	}


