// factorial of  n ? 
public class recursion3 {
    public static int factorial_n(int n) {
        if(n==0){
            return 1;
        }
        int fNm1 = factorial_n(n-1);
        int fN = n * fNm1;
        return fN;
    }

    public static void main(String[] args) {
        int n ;
        int fact = factorial_n(5);
        System.out.println(fact); 
        
        
        
    }
    
}
