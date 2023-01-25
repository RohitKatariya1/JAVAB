package ArrayOfObject;

import java.util.Scanner;

public class SupplierItemArray {

	public static void main(String[] args) {
	   Supplier2 s[]=new Supplier2[2];
	   
	  
	  Scanner sc=new Scanner(System.in);
	  
	  Item it[]=null;
	  
	  for(int i=0;i<s.length;i++)
	  {
		  System.out.println("enter id ");
		  int id=sc.nextInt();
		  System.out.println("enter name");
		  String name=sc.next();
		   it=new Item[3];
		  for(int j=0;j<it.length;j++)
		  {
			  System.out.println("Enter item name");
			  String s_name=sc.next();
			  System.out.println("Enter price");
			  int price=sc.nextInt();
			  
			  it[j]=new Item(s_name,price);
			 
		  }
		  s[i]=new Supplier2(id,name,it);
		  
		//System.out.println(s[i]);  
		   
	  }
         for(int i=0;i<s.length;i++)
          {
        	  System.out.println(s[i].id +" "+s[i].name);
        	  for(int j=0;j<it.length;j++)
        	  {
        		  System.out.println(s[i].i[j].item_name+" "+s[i].i[j].price);
        	  }
          }
          
	}

}
