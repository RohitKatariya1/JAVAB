package classWork;

public class Ternary1 {

	public static void main(String[] args) {
		
		int num1=20,num2=10,num3=40;
		         ///exp    t     f
		//String res=(num1>num2)?num1+"is greater":num2+"is greater";
		
		///System.out.println(res);
		
		int res=(num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3)?num2:num3;
		System.out.println(res);

	}

}
