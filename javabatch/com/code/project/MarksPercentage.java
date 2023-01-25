package com.code.project;

public class MarksPercentage {

	public static void main(String[] args) {
		float phy = 85,chem = 75,math = 90,hindi = 60,eng = 50;
		 float Total =phy+chem+math+hindi+eng;
		 float Average = (Total/5f);
		 float percentage = (Total/500.0f)*100;
		 
		 System.out.println("Total Marks is:" + Total);
		 System.out.println("Average marks is:" + Average);
		 System.out.println("percentage  is:" + percentage+"%");
		 
		 if(Average >=80 && Average<=100) {
			 System.out.println("A grade");
		 }
		 else if(Average >60 && Average<80) {
			 System.out.println("B grade");
		 }
		 else if(Average >40 && Average<60) {
			 System.out.println("C grade");
		 }
		 else if(Average > 35 && Average<40) {
			 System.out.println("D grade");
		 }
		 else
		 
		 System.out.println("Fail");
	
		
	}

}
