//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password = "crazy123";

	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your Password: ");
        String passwordChoice = keyboard.nextLine();

        PasswordCheck check = new PasswordCheck(passwordChoice);
        check();
	}

    public PasswordCheck(String passwordChoice)
	{
        if (passwordChoice==null)
        {
            check();
        }

        if (password.equals(passwordChoice))
        {
            System.out.println("VALID");
            System.exit(0);
        }

        else
        {
            System.out.println("INVALID");
        }
	}
}
