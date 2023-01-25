package Arrays1;

public class Varargs2 {
	
	
	
	
	void show(int...a)
	{
		System.out.println("int value");
	}
	
	
//	void show(char...a)
//	{
//		System.out.println("char value");
//	}
	
	void show(double...a)
	{
		System.out.println("float value");
	}
	
	
	
	

	
	

	public static void main(String[] args) {
		Varargs2 v=new Varargs2();
		v.show();

	}

}
