// optimized  > x^n ?
public class recursion10 {
    public static int optimized_x_pow_n(int x ,int n)  { //O(logn )
        if(n == 0){ // base case
            return 1;
        }
        // int halfPowSq = optimized_x_pow_n(x, n/2) *   optimized_x_pow_n(x, n/2);   // 2 time fn call // O(n); not optimized
           int halfPowSq = optimized_x_pow_n(x, n/2);
           halfPowSq = halfPowSq * halfPowSq;

       // n is odd
       if(n % 2 != 0){
           halfPowSq = x * halfPowSq;
       }

       return halfPowSq;
    }
    public static void main(String[] args) {
        System.out.println(optimized_x_pow_n(2, 5));
        
    }
    
}
