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
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			if(z%x==0 && z%y==0) {
				System.out.println("ANY");
			} else if (z%x==0 && z%y!=0) {
				System.out.println("CHICKEN");
			} else if (z%x!=0 && z%y==0) {
				System.out.println("DUCK");
			} else {
				System.out.println("NONE");
			}
		}
		
	}
}
