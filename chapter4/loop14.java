// NESTED LOOP   : 
// Q  > star pattern ?
public class loop14 {
    public static void main(String[] args) {
        // star pattern  ?
        
        // for(int line=1; line<= 10; line++){
        //     // one line
        //     for(int star=1; star<=line; star++){
        //         System.out.print("*");

        //     }
        // System.out.println(); 
    
        // inverted star pattern  ?
        int n = 4;
        for(int line =1; line <= n; line++){
            for(int star =1; star <= n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
