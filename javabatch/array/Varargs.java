package Arrays1;

public class Varargs {
	
	
	void call(int...a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	void showStringArg(int a,String...s)
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(a+" "+s[i]);
		}
	}
	
	void showStringArg(int a,int...s)
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(a+" "+s[i]);
		}
	}


	public static void main(String[] args) {
		
		Varargs v=new Varargs();
		v.call(10,20,30,40,50);
		System.out.println("-----");
		v.call(10,20,30);
		System.out.println("------");
		v.call(10,20);
		System.out.println("------");
		v.call();
		
		
		v.showStringArg(1,"red","black","brown");
		v.showStringArg(2,"ram","shyam");
		v.showStringArg(3,"Xyz company");
		v.showStringArg(1,"sonal","komal");

	}

}
