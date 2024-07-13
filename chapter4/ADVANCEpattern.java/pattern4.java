// package ADVANCEpattern.java;


// floyds triangle 


public class pattern4 {
    public static void floydsTriangle(int n){
        int num = 1;
        // inner loop : no. of lines
        for(int i =1; i<=n; i++){
            // inner loop: how many time counter will be printed 
            for(int j = 1; j<=i; j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        floydsTriangle(5);
    }
    
}
