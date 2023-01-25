package Assignment_31Dec;

import java.util.Scanner;

public class Question5 {
	int area;
	int rectangle,length,breadth;
	 public void area(int a){
		 area = a*a;
		 
	}
	 void display() {
		 System.out.println(area);
	 }
	 public void rectangle(int length,int breadth) {
		 rectangle = length*breadth;
		 display();
		 display1();
	 }
	 void display1() {
		 System.out.println(rectangle);
	 }
	

	public static void main(String[] args) {
	Question5 aa = new Question5();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value  of area-----");
	int a=sc.nextInt();
	aa.area(a);
	System.out.println("Enter the length");
	int l = sc.nextInt();
	System.out.println("Enter the breadth");
	int b= sc.nextInt();
	aa.rectangle(l,b);
	}

}
