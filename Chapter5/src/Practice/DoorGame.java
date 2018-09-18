package Practice;
import java.util.Scanner;
public class DoorGame 
{

	public static void main(String[] args) 
	{
		int doorChoice;
		String result;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door \n1- for door One\n2- for door Two\n3- for door Three");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1)
		{
			result = "a Pile of gold";
		}
		else if(doorChoice == 2)
		{
			result = "a Donkey!, what?!";
		}	
		else if(doorChoice == 3)
		{
			result = "a long fast food line!";
		}
		else 
			result = "nothing because that is not a choice!";
		
		displayMessage(result);
	}
	public static void displayMessage(String result)
	{
		System.out.println("You won " + result);
	}	
}
