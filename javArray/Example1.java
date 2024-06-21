package com.javArray;

public class Example1 {

	public static void main(String[] args)
	{
		 int values[] = {56, 45, 30, 69, 28, 18, 60};
		 
	        
	        System.out.print("Numbers divisible by 3 and 4: ");
	        
	        for (int i = 0; i < values.length; i++)
	        {
	            if (values[i] % 3 == 0 && values[i] % 4 == 0)
	            {
	                System.out.print(values[i] + " ");
	            }
	        }
	        System.out.println(); 
	    

	}

}
