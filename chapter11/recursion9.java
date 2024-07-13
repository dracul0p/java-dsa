//q>. find x^n ?
public class recursion9 {
    public static int power_x(int x , int n) {
        if(n == 0){
            return 1;
        }
        int powNm1 = power_x(x, n-1);
        int powN = x * powNm1;
        return powN; 

        // return x * power_x(x, n-1);
        
    }
    public static void main(String[] args) {
       
        int powN = power_x(2, 10);
        System.out.println(powN);
        
    }
}
