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
		for(int i=1; i<=t; i++) {
		    int n = sc.nextInt();
		    if(n%2 == 0 || n == 1) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
	}
}
