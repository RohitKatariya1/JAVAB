package classWork;

public class Payment_app {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.setC_id(1000001);
		c.setBalance(20000);
		c.setAcc_no(12335);
		
		
		
		System.out.println(c.getC_id());
		System.out.println(c.getBalance());
		System.out.println(c.getAcc_no());
		       //2000-2000
		int x=c.getBalance()-2000;
		c.setBalance(x);
		System.out.println("amount debited");
		System.out.println("current balance is....."+c.getBalance());
		
		
		
	}

}
