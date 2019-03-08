/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k,a=1,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		for(i=1;i<=k;i++)
		{
			a=a*n;
		}
		System.out.println(a);
	}
}
