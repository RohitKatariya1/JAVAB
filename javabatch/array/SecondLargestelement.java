package array;

public class SecondLargestelement {
	


		public static void main(String[] args) {
			int arr[] = {55,56,2,1,9,7};
			int temp,m = 0,n=0,o=0;
			
			
			for(int i = 0;i<arr.length;i++) {
				
				if(arr[i]>m) {
					o=  n;
					n=  m;
					m = arr[i];
				}
				else if(arr[i]>n) {
					o=n;
					n=arr[i];
				}
//				else if(arr[i]>o) {
//					o=arr[i];
//					
				
				
//				System.out.println("Third largest element are:"+m +" " +""+n +" "+ o);
			}
			System.out.println("Second largest element are:"+m +" "+n);
		
}
	}



