package Patterns;
import java.util.Scanner;
public class APatterns {

	public static void main(String[] args) {
		int i, j, a;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your number");
        a = sc.nextInt();
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
            System.out.print(" " + "A" + " ");

            }
            System.out.println(" ");

       }
    }

  }	
