package Arrays1;

public class EvenOdd {

	public static void main(String[] args) {
		int arr[]= {1,2,3,6,5,7,10};
		int arr3[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			 if(arr[i]%2==0)
			 {
				 arr3[j]=arr[i];
				 j++;
				 
			 }
			 
		}
		for(int i=0;i<arr.length;i++)
		{
			 if(arr[i]%2!=0)
			 {
				 arr3[j]=arr[i];
				 j++;
				 
			 }
			 
		}
		
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}

	}

}
