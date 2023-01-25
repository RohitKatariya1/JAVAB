package classWork;




public class Username {
	
	
	
	

	public static void main(String[] a)
	{
		CheckPassword1 c=new CheckPassword1();
		String s1=c.check();
		System.out.println(c.check());
		if(s1.equals("1234"))
		{
			System.out.println("welcome"+c.user);
		}
		else
			System.out.println("not a correct user");
		
		
	}

}
