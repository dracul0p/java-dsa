// clear ith bit : 
public class bit4 {
    public static int clear_ith_bit(int n ,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clear_ith_bit(10, 1));
        
    }
    
}
