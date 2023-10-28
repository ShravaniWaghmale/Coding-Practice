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
		for(int i=0; i<t; i++) {
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    
		    int count = 0; 
		        for (int j=0 ;j<n; j++) {
		            a[j] = sc.nextInt();
		            if(a[j]>=1000) {
		               count++;
		            }
		         }
		  	System.out.println(count);  
		}
	}
}

