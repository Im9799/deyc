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
	int a,b,c;
	a=s.nextInt();
	b=s.nextInt();
	while (a<b)
	{
       boolean flag = false;
       for(int i=2;i<=a/2;++i)
       {
       	if(a%i==0) 
       	{
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(a+ " ");

            ++a;
       	}
	}
}
