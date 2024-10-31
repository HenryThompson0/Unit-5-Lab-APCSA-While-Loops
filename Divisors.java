//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Divisors
{
	public static String getDivisors( int number )
	{
        int count = number;

        System.out.print("The divisors for "+number+" are ");

        while (count>0)
        {
            if (number%count == 0)
            {
                if (number/count != number)
                {
                    System.out.print((number/count)+" ");
                }
            }

            count -= 1;
        }

        System.out.println("");
		return ""; 
	}
}
