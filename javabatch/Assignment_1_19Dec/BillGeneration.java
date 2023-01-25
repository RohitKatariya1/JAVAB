package Assignment_1_19Dec;

public class BillGeneration {
	int pizza = 10;
	int puffs = 12;
	int cooldrink = 5;
	int Total = pizza*100+puffs*20+cooldrink*10;
	
	void print()
	{
		System.out.println(" Enter th no of pizzas bought:"+ pizza*100);
		System.out.println(" Enter th no of puffs bought:"+ puffs*20);
		System.out.println(" Enter th no of cool drink bought:"+ cooldrink*10);
		System.out.println(" Total price:"+Total);
		System.out.println(" ENJOY THE SHOW");
	}
	public static void main(String[] args) {
		BillGeneration A = new BillGeneration();
		A.print();
	}
}
