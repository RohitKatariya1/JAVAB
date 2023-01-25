package array;
//Searching;
import java.util.Scanner;

public class Store10Int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to store");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter the element ");
			
			for(int i = 0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
				
			}
		System.out.println("elements are----");
			for(int i =0;i<arr.length;i++) {
				
				System.out.println(arr[i]);
		}
	}
	
}