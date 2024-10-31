//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class CountOdds
{
   public static int go( int number )
	{
        String numDigitsPlaceholder = (String.valueOf(number));
        int numDigits = numDigitsPlaceholder.length();

        int numOddDigits = 0;

        while (numDigits>0)
        {
            int singleDigit = number%10;
            number = number/10;

            if (singleDigit % 2 != 0)
            {
                numOddDigits += 1;
            }

            numDigits -= 1;
        }

		return numOddDigits;
	}
}
