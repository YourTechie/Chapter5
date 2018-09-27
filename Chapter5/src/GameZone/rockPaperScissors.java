package GameZone;

import java.util.Scanner;

public class rockPaperScissors 
{

	public static void main(String[] args) 
	{
		int computerGuess;
		int userChoice;
		int rock = 1;
		int paper = 2;
		int scissors = 3;
		
		String result = null;
		
		Scanner input = new Scanner(System.in);
		
		computerGuess = (int)(Math.random() * 3 + 1);
		
		System.out.println("Rock, paper, Scissors. 1 for rock, 2 for paper, 3 for scissors!");
		userChoice = input.nextInt();
		
		if(computerGuess == 1)
		{
			if(userChoice == 1)
				result = "Tie!";
			else if(userChoice == 2)
				result = "You win!";
			else 
				result = "You lose!";
		}
		else if(computerGuess == 2)
		{
			if(userChoice == 2)
				result = "Tie!";
			else if(userChoice == 3)
				result = "You win!";
			else
				result = "You lose!";
		}
		else if(computerGuess == 3)
		{
			if(userChoice == 3)
				result = "Tie!";
			else if(userChoice == 1)
				result = "You win!";
			else
				result = "You lose!";
		}
		displayResult(result);
	}
	public static void displayResult(String result)
	{
		System.out.println(result);
	}
}
