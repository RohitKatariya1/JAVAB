package loops;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id");
	int id=sc.nextInt();
	System.out.println("Enter yourname");
	//String name=sc.next();
	String name=sc.nextLine();
	System.out.println("name is..."+name);

	}

}
