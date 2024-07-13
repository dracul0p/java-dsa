import java.net.SocketTimeoutException;

public class patterneprac {
    public static void invertedPyramid(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
    public static void invertedPyramid_no(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
          
            System.out.println();
        }
    }
    public static void zeroOneTriangle(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
          
            System.out.println();
        }

    }
   
 
   public static void main(String[] args) {
    //   invertedPyramid(4);
    //   invertedPyramid_no(4);
    zeroOneTriangle(5);
    }
}
 