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
		int t = sc.nextInt();
		while(t-->0) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = 7-a;
		    int d = 7-b;
		    if(c>d) {
		        System.out.println(d);
		    } else {
		        System.out.println(c);
		    }
		}
	}
}
