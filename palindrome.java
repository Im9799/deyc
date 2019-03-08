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
		int num,reverse=0,remainder,original;
		num=s.nextInt();
        original=num;
        while(num!=0)
        {
            remainder=num%10;
            reverse=reverse*10+remainder;
            num /=10;
        }
        if (original==reverse)
            System.out.println(original+" is a palindrome.");
        else
            System.out.println(original+" is not a palindrome.");
	}
}
