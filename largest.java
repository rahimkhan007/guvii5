import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a, b, c, big;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        // let a is the largest
        
        big = a;
        
        if(big<b)
        {
            if(b>c)
            {
                big = b;
            }
            else
            {
                big = c;
            }
        }
        else if(big<c)
        {
            if(c>b)
            {
                big = c;
            }
             else
            {
                big = b;
            }
        }
        else
        {
            big = a;
        }
		
        System.out.print("Largest Number is " +big);
    }

}
