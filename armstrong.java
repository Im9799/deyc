/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int number,a,r,result=0;
		number=s.nextInt();
        a=number;
        while (a != 0)
        {
            r=a% 10;
            result += Math.pow(r, 3);
            a /= 10;
        }

        if(result == number)
            System.out.println("yes");
        else
            System.out.println("no");
	}
}
