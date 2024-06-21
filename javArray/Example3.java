package com.javArray;

public class Example3 
{
	public static void main(String[] args)
	{
		
		int values[] = {24, 39, 36, 47, 27, 13, 66, 69, 55};

        int sumOdd = 0;  //size fixed
        int sumEven = 0;
        
        //for each loop
        for (int num : values) 
        {
            if (num % 2 == 0)
            {
                sumEven += num;
            }
            else 
            {
                sumOdd += num;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }

}
