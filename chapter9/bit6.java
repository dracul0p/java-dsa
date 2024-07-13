public class bit6 {
    public static int clear_I_bit(int n ,int i) {
        int bitmark = (~0)<<i;
        return n & bitmark;
    }
    public static void main(String[] args) {
        System.out.println(clear_I_bit(15, 2));
        
    }
    
}
