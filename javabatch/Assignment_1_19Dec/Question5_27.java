package Assignment_1_19Dec;

public class Question5_27 {
	String name;
	int password;
	
	Question5_27(){
		name = "Satya";
		password = 123456;
		
	}
	void display() {
		System.out.println("Employee name :  "+name);
		System.out.println("Employee password  : "+password);
	}

	public static void main(String[] args) {
		Question5_27 s = new Question5_27();
		s.display();
		Question5_27 s1 = new Question5_27();
		s1.name = s.name;
		s1.password = s.password;
		s1.display();
	}

}
