package Assignment_1_19Dec;

public class SpellCheck {
	String first  = "R";
	String second = "A";
	String third = "I";
	String fourth = "N";
	String fifth ="B";
	String sixth = "O";;
	String seventh = "W";
	
	String Total = (first+ second+ third+ fourth+ fifth+ sixth+ seventh);

	void print() {
		System.out.println("Enter the first letter :"+ first);
		System.out.println("Enter the second letter :"+ second);
		System.out.println("Enter the third letter :"+ third);
		System.out.println("Enter the fourth letter :"+ fourth);
		System.out.println("Enter the fifth letter :"+ fifth);
		System.out.println("Enter the sixth letter :"+ sixth);
		System.out.println("Enter the seventh letter :"+seventh);
		System.out.println("          "+Total);
//		System.out.println(" The Spelling is wrong");
	}
	
	
	public static void main(String[] args) {
		SpellCheck S = new SpellCheck();
		S.print();
	
	}
}
