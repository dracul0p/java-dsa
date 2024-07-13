// print subarrays of an array 

public class array10 {
    public static void subarrays(int number[]){
        int total_sub = 0;
        for(int i = 0; i<number.length ; i++){
            int start = i;
            for(int j = i; j<number.length; j++){
                int end = j;
                for(int k = start ; k <= end; k++){
                    System.out.print(number[k] + "   ");
                }
                total_sub++;
                System.out.println();
                
            } 
            System.out.println();
        }
        System.out.println("total sub array : " + total_sub);
        
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        subarrays(number);
        

    }
    
}
