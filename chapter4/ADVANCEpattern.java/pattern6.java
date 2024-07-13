// butterfly pattern  :

public class pattern6 {
    public static void butterflyPattern(int n){
        for(int i =1 ; i<=n ; i++){
            // 1st half :
            // stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            // space =  2 * (n-i)
             for(int j =1 ; j<=2 * (n-i); j++){
                System.out.print("  ");
            }

             // stars
             for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half :
        for(int i = n; i>=1; i--){
            for(int j = 1 ; j<=i ;j++){
                System.out.print("* ");
            }

            for(int j = 1; j<=2*(n-i); j++){
                 System.out.print("  ");
                }
            for(int j = 1 ; j<=i ;j++){
                System.out.print("* ");
            }

            System.out.println();


         }

    }
    public static void main(String[] args) {
        butterflyPattern(4);
    }
}
