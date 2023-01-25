package abstraction;


abstract class Car{
	static String name = "Hyundai";
	int price = 3000000;
	 Car(){
		System.out.println("Welcome to hyundai");
	}
	
	public void CarengineCC() {
		System.out.println("not decide car engine CC");
		
	}
	abstract public void Withgear() ;

	 
	
	
		
	}
	class CarExtraFunction extends Car{
		public void Withgear() {
		
			System.out.println("New Car launch without gear");
			System.out.println("Car engine is 1200cc");
			
		}
		 
		}
		

public class Carmain {

	public static void main(String[] args) {
		Car c= new CarExtraFunction();
		
		c.CarengineCC();
		c.Withgear();
		
		
	}

}
