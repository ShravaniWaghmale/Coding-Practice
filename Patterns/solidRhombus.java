package Patterns;

import java.util.*;

public class solidRhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //outer loop
        for(int i=1; i<=n; i++) {
            //spaces\
            int spaces = n-i;
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
