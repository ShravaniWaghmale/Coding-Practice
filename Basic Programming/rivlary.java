/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		if(r1+d1 > r2+d2) {
		    System.out.println("Dominater");
		} else {
		    System.out.println("Everule");
		}
	}
}
