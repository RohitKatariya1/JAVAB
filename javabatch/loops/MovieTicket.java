package loops;

import java.util.Scanner;

public class MovieTicket {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter movie name");
		String m_name=sc.next();
		System.out.println("Enter price");
		float price=sc.nextFloat();
		
		
		System.out.println("Booking person is..."+name);
		System.out.println("Movie name is..."+m_name);
		System.out.println("price name is..."+price);
		
		System.out.println("Enter coupon code");
		int code=sc.nextInt();
		
		if(code==100)
		{
			price=price-price*0.10f;
			System.out.println("your discounted ticket price "+price);
		}
		else if(code==50)
		{
			price=price-price*0.5f;
			System.out.println("your discounted ticket price "+price);
		}
		else
			System.out.println("your ticket price"+price);
		
		
		

	}

}
