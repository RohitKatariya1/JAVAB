package inheritanceclass;


	class laptop1{
		String name;
		String company;
		int price;
		
		laptop1(){
			
		}
	
	public laptop1(String name,String company,int price){
		this.name = name;
		this.company = company;
		this.price = price;
		
	}
		
	}
	class laptop2 extends laptop1{
		String processor;
		
	
	        
	
	
		laptop2(String name, String company, int price) {
			super(name, company, price);
			this.processor = processor;
			
		}
	
	public laptop2(String string) {
			
		// TODO Auto-generated constructor stub
		}

//	 void display(){
//		System.out.println("Name"+name);
//		System.out.println("company"+company);
//		System.out.println("price"+price);
//		System.out.println("processor"+processor);
//		
//	}
	public String toString() {
		return "name "+ name+"company"+company+"price"+price+"processor"+processor;
		
	}
public class Laptop {

	public static void main(String[] args) {
		laptop1 l;
		l=new laptop1("Lenovo","wrfg",150000);
		  l= new laptop2("i5 processor");
		System.out.println(l);
//		((laptop2) l).display(/);
	
		laptop1 l1;
		l1 =new laptop2("wdfgr","rhtht",13244);
		laptop2 l3=(laptop2)l1;
		System.out.println(l3);
	}
}
	}
	
	


