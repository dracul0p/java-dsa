import java.util.Scanner;

// package chapter4;
//Q .> keep entring no until user enter  a multiple of 10 ? 
public class loop10 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        do {
            System.out.println("enter no :");
            int n =sc.nextInt();
            if(n % 10 == 0 ){
                break;
            }
            
            System.out.println(n);
        } while(true);

     }
}