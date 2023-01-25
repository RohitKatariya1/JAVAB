package Assignment_1_19Dec;

public class Question4_27 {
	String name;
	int id;
	String course;
	int age;
	
	
	void Question4_27(){
		name = "Rohit";
		id = 17;
		course = "MCA";
		age = 22;
		display();
	}
	
	void display() {
		System.out.println("Student name is : "+name);
		System.out.println("Student id is : "+id);
		System.out.println("Student course is : "+course);
		System.out.println("Student age is : "+age);
	}

	public static void main(String[] args) {
			Question4_27 s= new Question4_27();
			s.display();
	}

}
