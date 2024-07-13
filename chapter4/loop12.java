import java.util.Scanner;

// package chapter4;
// Q. display all the no entered by user except multiple of 10 ?

public class loop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter no:");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                continue;
            }
            System.out.println(" your number was :" + n);
        
        } while(true);
        
    }
}
