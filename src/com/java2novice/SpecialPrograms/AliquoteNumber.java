package com.java2novice.SpecialPrograms;

public class AliquoteNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("[");
		for(int i=1; i<=100; i++)
		{
			if(isPerfectNumber(i))
			System.out.print(i + "  ");	
		}
		System.out.println("]");
	}
	public static boolean isPerfectNumber(int num)
	{
		int aliqSum=0;

		for(int i=1; i<num; i++)
		{
			if(num % i == 0) aliqSum += i;
		}
		if(aliqSum == num) return true;
	return false;
	}

}
