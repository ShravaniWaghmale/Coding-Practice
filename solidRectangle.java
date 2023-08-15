package Patterns;

import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //outer loop
        for(int i=1; i<=n; i++) {
            
            //inner loop
            for(int j=1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
