package assignment_14jan;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of elements in the 1st array :");
		int size = sc.nextInt();
		
		System.out.println("enter the size of elements in the 1st array :");
		int num1[]= new int[size];
		
		System.out.println("enter the size of elements in the 2nd array :");
		int size1= sc.nextInt();
		
		System.out.println("enter the size of elements in the 2nd array :");
		int num2[]= new int[size];
		
		for(int  i = 0;i<size;i++) {
			num1[i] = sc.nextInt();
			System.out.println(" " + num2[i]);
		}
		
		for(int j = 0;j<size1;j++) {
			num2[j]= num1[j];
			System.out.println(" " + num1[j]);
		}
		

	}

}
