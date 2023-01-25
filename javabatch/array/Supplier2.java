package ArrayOfObject;

import java.util.Arrays;

public class Supplier2 {
	
	int id;
	String name;
	static String c_name="Samsung";

	Item[] i;

	public Supplier2(int id, String name, Item[] i) {
		super();
		this.id = id;
		this.name = name;
		this.i = i;
	}

	@Override
	public String toString() {
		return "Supplier2 [id=" + id + ", name=" + name + ", i=" + Arrays.toString(i) + "]";
	}

	
}
