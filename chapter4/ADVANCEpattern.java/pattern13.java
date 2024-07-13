
// Diamond pattern:

public class pattern13 {
    public static void diamond_Pattern(int n){
        for(int i= 1; i<=n;i++){
            // spaces
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars:   // odd no : 2X-1 / 2x-2 
        
            for(int j =1; j<=((2*i)-1); j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n; i>=1; i--){
              // spaces
              for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars:   // odd no : 2X-1 / 2x-2 
        
            for(int j =1; j<=(2 * i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
            
    }
    public static void main(String args[]){
        diamond_Pattern(4);

    }
    
}
