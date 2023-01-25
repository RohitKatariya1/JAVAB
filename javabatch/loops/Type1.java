package loops;

public class Type1 {

	public static void main(String[] args) {
		// working on java
		
		
		char ch='D';
		//implicit type casting(converting lower to higher.It is safe)
		int num=ch;
		System.out.println(num);
		
		int num2=10000;//10000.00
		float f=num2;
		
		System.out.println(f);
		//explicit type casting(converting higher to lower.It is not safe)
		double num3=56.67;
		int a=(int) num3;
		System.out.println(a);
	}

}
