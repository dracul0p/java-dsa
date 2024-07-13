// update ith bit 
public class bit5 {
    public static int clear_ith_bit(int n ,int i) {
        int bitmask = ~(1<<i);
        return n & bitmask;
        
    }
    public static int set_ith_bit(int n ,int i){
        int bitmask = 1<<i;
        return n | bitmask;
        
    }


    // public static int update_ith_bit(int n ,int i , int newBit) {
        // if(newBit == 0){
            //     return clear_ith_bit(5, 1);
            // }else{
                //     return set_ith_bit(n, i);
                // }


        // public static void update_ith_bit(int n ,int i , int newBit) {
        //     int bitmask = 1<<i;
        //     if(newBit == 0){
        //         int Not_of_bitmark =~(1<<i);
        //         System.out.println(n & Not_of_bitmark);
                
        //     }else{
        //         System.out.println(n | bitmark);
        //     }

        public static int  update_ith_bit(int n ,int i , int newBit) {
            n = clear_ith_bit(n,i); // call
            System.out.println(n);
            int bitmask = newBit<<i;  
            return n | bitmask;
        }

    public static void main(String[] args) {
        // System.out.println(update_ith_bit(5, 1, 0));
        // update_ith_bit(5, 1, 0);
        System.out.println(update_ith_bit(10, 1, 1));
        
    }
    
}
