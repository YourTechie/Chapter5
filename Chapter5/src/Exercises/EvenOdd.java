package Exercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		int userNum;
		
		String result; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick an odd or even number");
		userNum = input.nextInt();
		
		if(userNum % 2 == 0)
		{
			result = "Your number is even";
		}
		else
			result = "Your number is odd";
			
		displayMessage(result);
	}
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}
}
