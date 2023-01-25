package array;

import java.util.Scanner;

public class Store20Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to store");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int e=0,o=0,p=0,ne=0,O=0;
		System.out.println("Enter the element ------");
		for(int i = 0;i<arr.length;i++) {
			int n = sc.nextInt();
			
			if(n>0) {
				p++;

			}
			 if(n<0) {
				ne++;
			}
			 if(o%2==0) {
				o++;
			}
			 if(e%2!=0) {
				e++;
			}
			 if(O==0){
				O++;
			}
		}
		System.out.println( "positive no is"+p);
		System.out.println( "negative no is"+ne);
		System.out.println( "even no is"+o);
		System.out.println( "odd no is"+e);
		System.out.println( " number of zeros are"+O);


	}

}
