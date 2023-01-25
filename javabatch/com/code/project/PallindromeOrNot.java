package com.code.project;

	public class PallindromeOrNot {
	    public static void main(String args[]){
	        int n,sum = 0,temp;
	        n= 121;
	         temp = n;
	        while(n>0){
	            int m =n%10;
	            sum = (sum*10+m);
	            n = n/10;
	        
	        }
	        if(temp == sum){
	            System.out.println("pallindrome");

	        }
	        else{
	        System.out.println(" not pallindrome");
	        }
	        
	    }
	}
