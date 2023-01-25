package Assignment_31Dec;

import java.util.Scanner;

public class Question7 {
	int id;
	String name;
	static String company_name;
	public void show(int id , String name) {
		this.id = id;
		this.name= name;
		
	}
	void display() {
		System.out.println("Employee id  is-----"+id);
		System.out.println("Employee name os----"+name);
	}

	public static void main(String[] args) {
	company_name = "-------Welcome to TCS pvt Ltd------";
	System.out.println(company_name);
	Question7 employ = new Question7();
	Scanner sc = new Scanner(System.in);
	employ.id = 1001;
	employ.name = "Ram";
	employ.display();

	}

}
