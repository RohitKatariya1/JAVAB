package classWork;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		num1=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		num2=sc.nextInt();
		
		
		for(int i=num1;i<=num2;i++)
		{
			
		System.out.println("---");
		for(int j=1;j<=10;j++)
		{
			int res=i*j;
			System.out.println(i+"*"+j+"="+res);
		}
		

	}

}
}
