package array;

import java.util.Scanner;

public class SumNdProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element ");
		int size=  sc.nextInt();
		int arr[] = new int[size];
		int sum = 0,product = 1;
		
		System.out.println("Enter the element you want to store");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		
			
		sum = sum+arr[i];
		product = product*arr[i];
		}
		System.out.println(product);
		System.out.println(sum);

	}
	

}
