package Arrays1;

public class MissingNum {

	public static void main(String[] args) {
       int arr[]= {5,3,1,2};
		
		int n=arr.length+1;  //n=5
		int sum=n*(n+1)/2;     //   sum=15
		System.out.println(sum);
		int sum1=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
		}
		System.out.println(sum1);
		int  missing=sum-sum1;
		System.out.println("Missing number is..."+missing);
		

	}

}
