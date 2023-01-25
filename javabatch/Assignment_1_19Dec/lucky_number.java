package Assignment_1_19Dec;

import java.util.Scanner;

public class lucky_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits");
		int num = sc.nextInt();
		int sum = 0;
		
		if(num>=1000 && num<=10000) 
		{
			if(num !=0) {
				num = num/10;
//				sum =sum%10;
			}
			if(num % 3==0 ||num%5 == 0|| num % 7 == 0) {
				System.out.println("My lucky number");
			}
			else 
				System.out.println("It is not lucky number");
			
			
		}
		}

}
