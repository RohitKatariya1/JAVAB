package Arrays1;

import java.util.Scanner;

public class Student1 {

	public static void main(String[] args) {
		int arr[][]=new int[2][5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2 ;i++)
		{
			
			
			System.out.println("Enter student"+(i+1));
			
			
			System.out.println("Enter marks");
			for(int j=0;j<5;j++)
			{
				arr[i][j]=sc.nextInt();
				
				
				
			}
			
			
		}
		
		for(int i=0;i<2 ;i++)
		{
			
			
			System.out.println("student "+(i+1));
			int sum=0;
			
			for(int j=0;j<5;j++)
			{
				
				//System.out.println(arr[i][j]);
				sum=sum+arr[i][j];
			}
			float per=sum/5.0f;
			System.out.println("percenatge is...."+per);
			
		}

	}

}
