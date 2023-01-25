package ArrayOfObject;

public class Supplier1 extends Sup{
	int id=10;
	String name;
	static String c_name="Samsung";

	Item i;

	public Supplier1(int id, String name, Item i) {
		super();
		this.id = id;
		this.name = name;
		this.i = i;
	}

	@Override
	public String toString() {
		return "Supplier1 [id=" + id + ", name=" + name + ", i=" + i + "]";
	}

	@Override
	void service() {
		{
			System.out.println(Supplier1.c_name+"providing services of appliances");
		}
		
	}
	
	

}
