package com.java2novice.SpecialPrograms;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String anagramStr = "hello god i lost my dog listen i am silent this hits a " + 					"century my pot painting is top in games";	
		 
			String[] wrds = anagramStr.split(" ");
			for(int i=0; i<wrds.length; i++)
			{	
				for(int j=(i+1); j<wrds.length; j++)
				{	
					if(areAnagrams(wrds[i], wrds[j]))
					System.out.println("("+wrds[i]+","+wrds[j]+")");
				}
			}	
	}
	public static boolean areAnagrams(String s1, String s2)
    {	
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1,ch2);
    }

}
