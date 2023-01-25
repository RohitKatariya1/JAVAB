package String;

import java.util.Scanner;

public class FirstOccuranceCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to find first character");
		String S = sc.nextLine();
		
		System.out.println("Enter the character to find");
		char ch = sc.next().charAt(0);
		  int count = 0, flag=0;
		  int i=0;
		for( i = 0;i<S.length();i++) {
			
			if(S.charAt(0) == ch)
			{
				
			
			flag++;
			break;
	
			}
			i++;}
		if(flag == 1) {
		
		System.out.println("character is : " + ch + " "+ i);
		}
		else {
			System.out.println("character is not present ");
		}
	}

}
