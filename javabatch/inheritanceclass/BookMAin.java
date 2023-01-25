package inheritanceclass;

import java.util.Scanner;

public class BookMAin {
	public static void main(String[] args) {
		Book b = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book name");
		b.setName(sc.next());
		System.out.println("Enter the Author name");
		b.setAuthorname(sc.next());
		System.out.println("Enter the price");
		b.setPrice(sc.nextInt());
//		System.out.println("Book name is---"+b.name);
//		System.out.println("Authorname is---"+b.authorname);
//		System.out.println("Book price is----"+b.price);
	}
}
