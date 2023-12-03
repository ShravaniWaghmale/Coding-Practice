// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int sum = 0 ;
            while(a>0){
            int temp = a%10;
            sum +=temp;
            a/=10;
            }
            System.out.println(sum);
        }
    }
}

