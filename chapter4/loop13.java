import java.util.Scanner;

// package chapter4;
// Q. > check no is prime or not ? 

public class loop13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
      
        // boolean isPrime = true;
        // for(int i = 2 ; i< n; i++){
        //     if(n % i == 0){  // n is multiple of i(i not  equal to 1 or n)
        //         isPrime = false;
        //     }

        // }
        // if(isPrime == true) {
        //     System.out.println("n is prime");
        // } else {
        //     System.out.println("not prime");
        // }

        if(n==2){
                System.out.println(n +" is prime");
        }
        boolean isPrime = true;
        for(int i = 2 ; i<=Math.sqrt(n); i++){  // optimised loop
            if(n % i == 0){  // n is multiple of i(i not  equal to 1 or n)
                isPrime = false;
            }

        }
        if(isPrime == true) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " not prime");
        }
        sc.close();
    }
}

