package Patterns;

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //OUTER LOOP
        for(int i=1; i<=n; i++){
            //INNER LOOP
            for(int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }System.out.println();
        } 
    }
}
