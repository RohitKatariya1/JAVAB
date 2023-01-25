package classWork;

public class CarCreation {
	static String c_name="----WELCOME CAR SOLD----";
	static String i_name="===InttotalCarSold===";
    int c_model;
    String c_enginNo;
    int totalcarsold ;
    
   CarCreation(){
	   
   }
     
     public CarCreation( int c_model, String c_enginNo , int totalcarsold) {
		
		this.c_model = c_model;
		this.c_enginNo = c_enginNo;
		this.totalcarsold = totalcarsold;
	}
	void display() {
    	
    	 System.out.println("Car model is="+c_model);
    	 System.out.println("Car engine number="+c_enginNo);
    	 System.out.println("Total car sold ="+totalcarsold);
     }
	static void car() {
		System.out.println("There are static variable");
//		System.out.println(c_name);
		no_static();
	}
  static void no_static() {
	 System.out.println("Non static variable");
 }
	public static void main(String[] args) {
		System.out.println(c_name);
		System.out.println(i_name);
		CarCreation c=new CarCreation( 2022, "SND2211033A",100);
		c.display();
		System.out.println("----------------------");
		CarCreation c1=new CarCreation(2021 ,"SNW2211034A" , 500);
//		
//		c1.c_model=c.c_model;
//		c1.c_enginNo=c.c_enginNo;
//		c1.totalcarsold = c.totalcarsold;
		c1.display();
		c.car();
		no_static();
		
	}
}
