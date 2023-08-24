package Arrays;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
       
        //TO TAKE VALUE FROM USER
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int []numbers = new int[size];
        
//FOR LOOP FOR INPUT
        for (int i=0; i<size; i++){
            numbers[i] =sc.nextInt(); 
        }

//FOR LOOP FOR OUTPT
        for(int i=0; i<size; i++) {
            System.out.println(numbers[i]);
        }
    }
}

