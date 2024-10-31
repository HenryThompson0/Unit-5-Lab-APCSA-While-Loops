//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner
{
	public static void main(String args[])
	{
        char response;
        Scanner keyboard = new Scanner(System.in);

        do
        {
            System.out.print("How many numbers? ");
            int range = keyboard.nextInt();
            GuessingGame n = new GuessingGame(range);

            System.out.print("Do you want to play again? ");
            response = keyboard.next().toLowerCase().charAt(0);

        }while(response == 'y');
	}
}
