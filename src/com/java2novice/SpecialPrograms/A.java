package com.java2novice.SpecialPrograms;

import java.util.Scanner;

public class A{
	
	public static void main(String[] args) {
		
		int FirstNumber,SecondNumber,sum = 0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please Input the First Number");
		FirstNumber=sc.nextInt();
		System.out.println("Please Input the Second Number");
		SecondNumber=sc.nextInt();
		
	        while (SecondNumber != 0)
	        {
	            int carry = (FirstNumber & SecondNumber) ;
	          
	            FirstNumber = FirstNumber ^SecondNumber;
	     
	            SecondNumber = carry << 1;
	            
	            sum =FirstNumber;
	        }
	        System.out.println("The sum is "+sum);
	}
}