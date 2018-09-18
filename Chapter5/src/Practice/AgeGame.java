package Practice;
import java.util.Scanner;
public class AgeGame 
{
	public static void main(String[] args) 
	{
		int usersAge;
		String result;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter your age to be insulted");
		usersAge= input.nextInt();
		
		if(usersAge <= 12)
		{
			result = "You are a little brat!";
		}
		else if(usersAge >= 13 && usersAge <= 18)
		{
			result = "You are a snotty teen";
		}	
		else if(usersAge >=19 && usersAge <= 25)
		{
			result = "Go get a job!";
		}
		else if(usersAge >= 26 && usersAge <= 30)
		{
			result = "Get back to work!";
		}	
		else if(usersAge >= 31 && usersAge <= 40)
		{
			result = "Go find youself a wife!";
		}
		else if(usersAge >= 41 && usersAge <= 50)
		{
			result = "Retire you old hag!";	
		}	
		else if(usersAge >= 51 && usersAge <= 60)
		{
			result = "Go find yourself a hobby!";
		}	
		else if(usersAge >= 61)
		{
			result = "Shouldn't you be dead!";
		}
		else 
			result = "You cannot do that!";
		//0-12
		//13-18
		//19-25
		//26-30
		//31-40
		//41-50
		//51-60
		//61-dead
		displayMessage(result);
	}
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}
}
