import java.util.Random; // Import random number method	
import java.util.Scanner; // Import input by keyboard method

public class Guessnumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Create object input keyboard
	System.out.println("Hi try to guess number about I'm thinking.");
	System.out.println("What is your name?");
	String name = scanner.nextLine();
        System.out.println("You have five chance to guess." + " " + "Good luck" + " " + name);
        Random rand = new Random(); // Create random number object
	int guessNumber = rand.nextInt(20); // Set random number between 0 - 20
        guessNumber += 1;   // Add 1 to the result to get a number from required range 1 - 20
	//System.out.println(guessNumber); Test
	System.out.println("I'm thinking about number between 1 - 20. What is the number?");
        

	for(int i = 0; i < 5; i++) // Set number of try
	{
	    
	    number = scanner.nextInt(); // Input value

	    if(number > guessNumber)  // User number is big
	        {
		    System.out.println("Your number is too big.");
		}
	    
	    if(number < guessNumber) // User number is small
		{
		    System.out.println("Your number is too small.");
		}
	    
	    if(number == guessNumber) // User number is correct
		{
                    System.out.println("Exactly. This it that number!");
		    break;
		}
	}
    }
}
