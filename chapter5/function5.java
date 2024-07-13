import java.util.Scanner;

// package chapter5;

// product of and b ? 

public class function5 {
    public static int multiply(int a ,int b){
       int product = a*b;
       return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product= multiply(a,b);
        System.out.println("product of a * b :" + product);

    }
}
 
 