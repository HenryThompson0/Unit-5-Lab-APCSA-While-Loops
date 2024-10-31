//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class DivisorsRunner
{
	public static void main( String args[] )
	{
        int[] cases = {10,45,14,1024,1245,33,65535};
        Divisors n = new Divisors();

        for(int val : cases)
        {
            System.out.print(n.getDivisors(val));
        }
	}
}
