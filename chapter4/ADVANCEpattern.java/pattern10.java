public class pattern10 {
    public static void NumberPyramid(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for(int j= 1; j<=i; j++){
                System.out.print(i  + " ");
            }
            for(int j=1; j<=(n-1); j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        NumberPyramid(5);
        
    }
}
