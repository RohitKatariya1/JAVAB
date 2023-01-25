package Assignment_31Dec;

public class Question4 {
	static String c_name = ("-----Welcome TO Company-----");
	String name;
	int id;
	Question4(String name,int id){
		this.name = name;
		this.id = id;
		
				}
	void display() {
		System.out.println("Employee name is-----"+name);
		System.out.println("Employee id id-----"+id);
		
	}

	public static void main(String[] args) {
		Question4 e =new Question4("Ram",10001);
		e.display();
		methodcall4 m =  new methodcall4("HR");
		m.display();

	}

}
