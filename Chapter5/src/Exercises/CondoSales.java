package Exercises;

import java.util.Scanner;

public class CondoSales 
{
	public static void main(String[] args) 
	{
		int choice;
		int parkview = 150000;
		int golfcourse = 170000;
		int lakeview = 210000;
		int price = 0;
		
		int garage;
		
		String result;
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Pick a number 1-3");
			choice = input.nextInt();
			
			if(choice == 1)
			{
				result = "You've chosen the park view";
				price = parkview;
			}
			else if(choice == 2)
			{
				result = "You've chosen the golf course view";
				price = golfcourse;
			}
			else if(choice == 3)
			{
				result = "You've chosen the lake view";
				price = lakeview;
			}
			else
				result = "That is not a choice";
			System.out.println("Do you want to add a garage? 1 for yes 2 for no");
			garage = input.nextInt();
		}while(2 != garage);
			if(garage == 1)
			{	
				price = price + 5000;
			}	
			else if(garage == 2)
			{
				price = price;
			}
			else
				System.out.println("That is not an option!");
		displayChoice(result);
		System.out.println("The price for it is " + price);
	}
	public static void displayChoice(String result)
	{
		System.out.println(result);
	}
}
