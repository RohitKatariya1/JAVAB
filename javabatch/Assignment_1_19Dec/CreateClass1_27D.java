package Assignment_1_19Dec;

public class CreateClass1_27D {
	String name;
	int id;
	
	
	CreateClass1_27D(String s,int i){
		name =s;
		id = i;
	
	}

	public static void main(String[] args) {
		CreateClass1_27D  a = new CreateClass1_27D("RAM",23);
		System.out.println(a.name);
		System.out.println(a.id);
	}

}
