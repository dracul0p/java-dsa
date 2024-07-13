public class bit7 {
    public static int clear_IN_range(int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1 << i)-1;
        int bitmask = a|b;
        return n & bitmask;
        
    }
    public static void main(String[] args) {
        System.out.println(clear_IN_range(10, 2, 4));
        
    }
    
}
