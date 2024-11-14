//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
    private int upperBound;
    private int compChoice;
    private int playChoice;
    private double numGuesses;
    private double percent;

	public GuessingGame(int stop)
	{
        upperBound = stop;
        compChoice = (int)(Math.random()*upperBound+1);
        playGame();
	}

	public void playGame()
	{
        do
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Guess a number between 1 and "+upperBound+": ");
            playChoice = keyboard.nextInt();
            if (playChoice>upperBound || playChoice<1)
            {
                System.out.println("That number is out of range! ");
            }
            if (playChoice<compChoice)
            {
                System.out.println("The number is higher than "+playChoice);
            }
            if (playChoice>compChoice)
            {
                System.out.println("The number is lower than "+playChoice);
            }
            numGuesses += 1;
            
        } while (playChoice != compChoice);
        
        percent = ((numGuesses-1)/numGuesses)*100;

        System.out.println("It took you "+(int)numGuesses+" guesses to guess "+compChoice+". ");
        System.out.println("You guessed wrong "+(int)percent+" percent of the time.");
	}

	public String toString()
	{
		String output="";
		return output;
	}
}
