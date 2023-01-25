package Pratice;

import java.util.Scanner;

public class StudentMain {
	
	
	static void sort(STudent1 s[])
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].getMarks()<s[j].getMarks())
				{
					int temp=s[i].getMarks();
					int marks=s[j].getMarks();
					s[i].setMarks(marks);
				//	s[j].getMarks();
					s[j].setMarks(temp);
					
					
					
					String temp1=s[i].getName();
					String st=s[j].getName();
					s[i].setName(st);
				//	s[j].getName();
					s[j].setName(temp1);;
					
					
					
					int temp2=s[i].getRoll_no();
					
					int roll=s[j].getRoll_no();
					s[i].setRoll_no(roll);
					
					//s[j].getRoll_no();
					s[j].setRoll_no(temp2);
					
					
				}
				
			}
		}
	}

	public static void main(String[] args) {
		STudent1 s[]=new STudent1[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter marks");
			int marks=sc.nextInt();
			
			s[i]=new STudent1();
			s[i].setRoll_no(id);
			s[i].setName(name);
			s[i].setMarks(marks);
			
			
		}
		
		for(int i=0;i<s.length;i++)
		{
			
			System.out.println(s[i].getRoll_no() +" "+s[i].getName()+" "+s[i].getMarks());
		}
		
	sort(s);
	
	for(STudent1 st:s)
	{
		System.out.println(st);
	}
		

	}

}
