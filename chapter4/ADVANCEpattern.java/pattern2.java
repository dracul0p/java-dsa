// package ADVANCEpattern.java;

// inverted and half pyramid  :

public class pattern2 { 
    public static void inverted_rotated_Half_Pyramid(int n){
        // outer
        for(int i=1; i <= n; i++){
            // spaces
            for(int j = 1; j <= n-i ; j++){
                System.out.print("");
                
            }
                // stars 
            for(int j = 1 ; j<=i ; j++ ){
                System.out.print("*");

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        inverted_rotated_Half_Pyramid(4);
        
    }
    
}
