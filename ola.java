/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String name,mail;
		long ph;
		double src,d,amount,distance;
		int ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Name:");
		name=s.nextLine();
		System.out.println("E-Mail");
		mail=s.nextLine();
		System.out.println("Phone:");
		ph=s.nextLong();
		System.out.println("Source:");
		src=s.nextDouble();
		System.out.println("Destination:");
		d=s.nextDouble();
		distance=d-src;
		System.out.println("1.Auto");
		System.out.println("2.Micro");
		System.out.println("3.Mini");
		System.out.println("4.Premium");
		System.out.println("Choice:");
		ch=s.nextInt();
		if(ch==1)
		{
			amount=distance*10;
			System.out.println("The cost is:"+amount);
		}
		else if(ch==2)
		{
			amount=distance*15;
			System.out.println("The cost is:"+amount);
		}
		else if(ch==3)
		{
			amount=distance*20;
			System.out.println("The cost is:"+amount);
		}
		else if(ch==4)
		{
			amount=distance*25;
			System.out.println("The cost is:"+amount);
		}
		else
		{
			System.out.println("Please chose your category...");
		}
		
	}
}
