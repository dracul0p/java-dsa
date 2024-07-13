// Q 13 >  friends pairing problem ? //gold man sachs

public class recursion13{
    public static int friendsPairing(int n) {
        if(n == 1  || n == 2) {
            return n;
        }
        // // single 
        // int fnm1 = friendsPairing(n-1) ;
        // // paire
        // int fnm2 = friendsPairing(n-2);
        // int paireWays =(n-1) * fnm2;
        // int totalWays = fnm1 + paireWays;
        // return totalWays;
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}