package com.javArray;

public class Example2 {

	public static void main(String[] args)
	{
		int values[] = {56, 45, 30, 69, 28, 18, 60};

        System.out.println("Numbers divisible by 3:");

        for (int i = 0; i < values.length; i++)
        {
            if (values[i] % 3 == 0)
            {
                System.out.println(values[i]);
            }
        }
	}

}
