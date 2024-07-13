
// package chapter11;

public class recursion1 {
    public static void printDec(int n) {
        if(n == 1){                  // base case f(1) = 1
            System.out.println(n);
            return;
        }
        System.out.print (n + " ");
        printDec(n-1);
    }
    
    public static void main(String[] args) {
        int  n;
        printDec(10);
    }
}