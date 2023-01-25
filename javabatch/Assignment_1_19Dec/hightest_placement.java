package Assignment_1_19Dec;

import java.util.Scanner;

public class hightest_placement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of placement in CSE: ");
		int CSE = sc.nextInt();
		System.out.println("Enter the no of placement in ECE: ");
		int ECE = sc.nextInt();
		System.out.println("Enter the no of placement in MECH: ");
		int MECH = sc.nextInt();
		
		if(CSE>ECE && CSE>MECH ) {
			System.out.println("Hightest Placement" + "CSE");
		}
		else if(ECE>CSE && ECE>MECH) {
			System.out.println("Hightest Placement "+ "ECE");
		}
		else {
			System.out.println("Hightest Placement "+ "MECH");
		}
	}
  }

