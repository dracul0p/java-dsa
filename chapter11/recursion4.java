// sum of first n natural no ?

public class recursion4 {
    public static int sum_first_n(int n){
        if(n == 1){
            return 1;
        }
        int  sum_no_m1  =  sum_first_n(n-1);
        int sum_no = n + sum_no_m1 ;
        return sum_no;
        
    }
    public static void main(String[] args) {
        int n ;
        System.out.println(sum_first_n(5));
        
    }
    
}
