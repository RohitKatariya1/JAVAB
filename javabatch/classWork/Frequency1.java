package classWork;

import java.util.Scanner;

public class Frequency1 {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();*/
		int num=11334545;
		int rem=0;
		
			 for(int i=0;i<=9;i++)
				{
			//	 System.out.println("-----");
				// System.out.println(i);
				 int count=0;
				int temp=num;
				 while(temp>0)
					{
						rem=temp%10;
						
					if (rem==i )
					{
						count++;
					}
				temp=temp/10;
					}
				 if(count>0)
				 {
					 
				 
				
			System.out.println(i+"frequency is"+count);
				
				 }
				}
				
				
				

	


}
}
