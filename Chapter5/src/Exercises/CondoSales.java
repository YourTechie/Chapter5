package Exercises;

import java.util.Scanner;

public class CondoSales 
{
	public static void main(String[] args) 
	{
		int choice;
		
		
		
		String result;
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Pick a number 1-3");
			choice = input.nextInt();
			
			if(choice == 1)
			{
				result = "You've chosen the park view for 150,000$";
			}
			else if(choice == 2)
			{
				result = "You've chosen the golf course view for 170,000$";
			}
			else if(choice == 3)
			{
				result = "You've chosen the lake view for 210,000$";
			}
			else
				result = "That is not a choice";
			displayChoice(result);
		}while();	
	}
	public static void displayChoice(String result)
	{
		System.out.println(result);
	}
}
