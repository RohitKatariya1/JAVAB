package stringAssignment_21jan;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "JAVA";
//		String s2 = new String("JAVA");
		String s2 ="JAVA";
		
		if(s1 == s2) {
			System.out.println("String is immutable");
		}
		else {
			System.out.println("String is not immutable");
		}
				
	}

}
