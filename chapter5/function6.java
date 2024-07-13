import java.util.Scanner;

// package chapter5;
// factorila of a no .
// binomial cofficient ?   :    nCr = n! / (r! * (n-r)!)


public class function6 {
    public static int factorial(int n){
        int f = 1 ;
        for(int i=1 ; i<=n ; i++){
            f = f * i;
        }
        return f;  // factorial n

    }
    public static int binCoff(int n ,int r){
        int fn = factorial(n);
        int fr = factorial(r);
        int fnMr = factorial(n-r);                                           
        int binCoff = fn /(fr *  fnMr);
        return binCoff;

    }


    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int f = factorial(n);
        // System.out.println(f);
        System.out.println(factorial(7));
        System.out.println(binCoff(5, 2));
    }
    
}
