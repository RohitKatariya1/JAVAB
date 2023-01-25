package classWork;

public class SumOfNumbers {
	
	int sum=0;
	int sum1()
	{
		
		  for(int i=1;i<=10;i++)
		  {
			sum=sum+i;  
		  }
		 return sum;//55
	}
	public static void main(String[] args) {
		SumOfNumbers s=new SumOfNumbers();
		System.out.println(s.sum1());//55
		
		

	}

	

}
