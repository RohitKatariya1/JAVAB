package stringAssignment_21jan;

import java.util.Scanner;

public class ConvertUppercaseToLowerCase {

	public static void main(String[] args) {
		char upper,lower = 0;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		upper  =sc.next().charAt(0);
		
		temp = upper;
		temp = temp+32;
		lower = (char)temp;
		
	
	
	System.out.println("lowercase" + lower);
	}
}
