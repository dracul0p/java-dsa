
// pair in array :

public class array9 {
    public static void printPair(int number[]) {
        int total_pair = 0;
        for(int i = 0; i<number.length; i++){
            int curr = number[i];  // 2,4,6,8,10
            for(int j = i+1; j<number.length; j++){ 
                System.out.print("(" + curr + "," + number[j] +")");

                
                total_pair++;
            }
            System.out.println( );
        }
        System.out.println("total pairs :" + total_pair);

    }
    public static void main(String[] args) {
        int number[] ={2,4,6,8,10};
        printPair(number);

        
    }
    
}
