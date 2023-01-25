package Patterns;

public class RectanglePatt {

	public static void main(String[] args) {
		/*for(int i=1;i<=5;i++)//rows
		{
			//System.out.print(i);
			for(int j=1;j<=5 ;j++)//cols
			{
				System.out.print("*"+" ");
			}
			System.out.println("");
		}*/
		
		for(int i=1;i<=5;i++)//rows
		{
			//System.out.print(i);
			for(int j=1;j<=i ;j++)//cols
			{
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		
		
	}

}
