package classWork;

import java.util.Scanner;

public class Quantity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
	/*	while(true)
		{
			System.out.println("Enter milk quntity");
			int m_quantity=sc.nextInt();
			System.out.println("Enter oil quntity");
			int o_quantity=sc.nextInt();
			 sum=m_quantity*40+o_quantity*50;
			
			if(sum>500)
			{
				break;
			}
			
		}
		System.out.println(sum);*/
		
		
		
		while(sum<=500)
		{
			System.out.println("Enter milk quntity");
			int m_quantity=sc.nextInt();
			System.out.println("Enter oil quntity");
			int o_quantity=sc.nextInt();
			 sum=m_quantity*40+o_quantity*50;
			 System.out.println(sum);
			
			/*if(sum>500)
			{
				break;
			}*/
			
		}
		System.out.println(sum);

	}

}
