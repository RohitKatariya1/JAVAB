package Assignment_31Dec;

public class Question3 {
	int accountNo;
	int noofWheels;
	  Question3(){
		
		System.out.println("Default Constructor");
	}
	public Question3(int noofWheels) {
		System.out.println("Another Constructor");
		this.noofWheels =noofWheels;
	}
	void display() {
		System.out.println("Cycle no.of wheels-----"+noofWheels);
	}
	public static void main(String[] args) {
		Question3 Q = new Question3();
		Question3 Q1 = new Question3(4);
		Q1.display();
		member m = new member("Ram",81002453);
		m.display();
	}
}
