package String;

import java.util.Scanner;

public class CharacterCount {
	

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String to find first character");
			String S = sc.nextLine();
			
			System.out.println("Enter the character to find");
			char ch = sc.next().charAt(0);
			  int count = 1, flag=0;
			  int i=0;
			for( i = 0;i<S.length();i++) {
				
				if(S.charAt(i) == ch)
				
					
				
				count++;
		
				}
				
			System.out.println("character is : " + ch + " "+ count);
			
		}

		}




