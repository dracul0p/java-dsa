
//  Nth fibonacci of no ? 

public class recursion5 {
    public static int fib(int n){
        if(n == 0 || n == 1){ // base case 
            return n;
        }
        
        int fNm1 = fib(n-1);
        int fNm2 = fib(n-2);
        int fN = fNm1 + fNm2;
        return fN;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
    
}
