package stringAssignment_21jan;

public class Averageofdigitsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a5i9gfj4tabcqwerq";
		int count = 0;
//		String string = "";
		for(int i = 0;i<str.length();i++)
		{
			
			
			if(str.charAt(i) != ' ')   
	                count++;    
		}
		System.out.println(count/2);
	}

}
