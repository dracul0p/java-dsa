// package chapter9;
// operations : get ith bit 
public class bit2 {
    public static int Getbit(int n , int i) {
        int bitmask = n<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
        
    }
    public static void main(String[] args) {
        int bit_is =Getbit(15, 4);
        System.out.println(" i th bit is:" + bit_is);

        // int n =15;
        // int i = 2; // position
        // int bitmask = n<<2;
        // if((n & i ) == 0){
        //     System.out.println("bit is zero");
        // } else{
        //     System.out.println("bit is one");
        // }
        
    }
    
}
