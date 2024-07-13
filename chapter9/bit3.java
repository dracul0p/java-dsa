// set ith bit : i.e convert it to 1 



public class bit3 {
    public static int set_ith_Bit(int n, int i) {
        int bitmask = i<<1;
        return (n | bitmask);
            
        }
    public static void main(String[] args) {
        System.out.println(set_ith_Bit(10, 2));
         
    }
    
}
