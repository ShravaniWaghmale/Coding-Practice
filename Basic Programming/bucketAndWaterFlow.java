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
		    int w = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    if(w+y*z>x) {
		        System.out.println("Overflow");
		    } else if(w+y*z<x) {
		        System.out.println("Unfilled");
		    } else {
		        System.out.println("Filled");
		    }
		}
	}
}
