package Exercises;

import java.util.Scanner;

public class AscendDescend 
{
	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int num3;
		
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("List an integer >>");
		num1 = input.nextInt();
		System.out.println("List another integer");
		num2 = input.nextInt();
		System.out.println("List another integer");
		num3 = input.nextInt();
		
		if(num1 < num2 && num2 < num3)
		{
			result = "The numbers from least to greatest are " + num1 + num2 + num3;
		}
		else if(num2 < num1 && num1 < num3)
		{
			result = "The numbers from least to greatest are " 
		}
	
	}
	

}
