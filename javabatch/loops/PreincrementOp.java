package loops;

public class PreincrementOp {
	
	public static void main(String ar[])
	{
		int a=10;
		int b=4;
		/*int x=a++;
		System.out.println(x);
		System.out.println(a);*/
		
		/*int x1=++a;
		System.out.println(x1);
		System.out.println(a);*/
		    // 10 + 5 + 5 + 10
		    //  10 + 5*5 +10
		int x=a++ + ++b * b + --a;
		System.out.println(x);
	}

}
