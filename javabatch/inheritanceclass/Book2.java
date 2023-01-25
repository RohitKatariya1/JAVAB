package inheritanceclass;

public class Book2 {
	public static void main(String[] args) {
		BookMAin b1 = new BookMAin();
		Book b = new Book();
		System.out.println("Book name is---"+b.name);
		System.out.println("Authorname is---"+b.getAuthorname());
		System.out.println("Book price is----"+b.getPrice());
	}
}
