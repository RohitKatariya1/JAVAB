import java.util.Scanner;

class Item
{
	int id;
	String name;
	int price;
	
	Item(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}

	/*@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", price=" + price ;
	}*/
	
	
	void display()
	{
		System.out.println( "id=" + id + ", name=" + name + ", price=" + price);
	}
	
	
	
}
public class ObjectArray {

	public static void main(String[] args) {
		Item item[]=new Item[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<item.length;i++)
		{
			System.out.println("Enter item "+(i+1) +" details");
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter salary");
			int price=sc.nextInt();
			
			item[i]=new Item(id,name,price);
			System.out.println(item[i]);
		}
		

	/*	for(int i=0;i<item.length;i++)
		{
			System.out.println(item[i]);
		}*/
		
		for(Item i:item)
		{
			i.display();
		}
		
		
		
		
	}

}
