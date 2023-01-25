package Assignment_31Dec;

public class member {
	String name;
	int accountNo;
	member(String name,int accountNo){
		this.name = name;
		this.accountNo = accountNo;
		
	}
	void display() {
		System.out.println("member name is------"+ name);
		System.out.println("member account no is ----"+accountNo);
	}
}
