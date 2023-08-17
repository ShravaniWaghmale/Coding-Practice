package Patterns;

import java.util.Scanner;

public class floydsTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = sc.nextInt();

        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }

    }
}
