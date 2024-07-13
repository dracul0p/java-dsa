//  Q11 > . Tiling problem ? 
public class recursion11 { 
    public static int tillingProb(int n ) {
        if(n == 0 || n ==1){                 // base case
            return 1;
        }

        // kaam : choice
        //vertical choice
        int fNm1 = tillingProb(n-1);

        // horizontal choice
        int fNm2 = tillingProb(n-2);

        int totalWays =   fNm1 + fNm2;
        return totalWays;
        
    }
    public static void main(String[] args) {
        int ways = tillingProb(4);
        System.out.println(ways);   // output :3
    }
    
}
