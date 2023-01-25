package classWork;
//constructor chaining=when you can call one constructor from another constructor
//using this kwyword
public class ThisInConstructor {
	
	ThisInConstructor()
	{
		this(10,30);
		//ThisInConstructor t=new ThisInConstructor(10);
		System.out.println("default constructor");
		
	}
	
	ThisInConstructor(int x)
	{
		
		System.out.println("Constructor with single value");
		System.out.println(x);
	}

	ThisInConstructor(int x,int y)
	{
		this(34);
		System.out.println("Constructor with two value");
		System.out.println(x+" "+y);
	}
	
	

	public static void main(String[] args) {
		ThisInConstructor  t=new ThisInConstructor ();
	/*	ThisInConstructor  t1=new ThisInConstructor (10);
		ThisInConstructor  t2=new ThisInConstructor (23,30);*/
		

	}

}
