import java.util.Scanner;

// reverse an array :   faltu ki mahnet  //  errrorr rrrrrrrrrrrrrrrr
public class array7 {
    // public static void reeverseArray(int numbers[]) {
    //     int num1[] = new int[numbers.length];
    //     for(int i = numbers.length -1; i >= 0 ; i-- ){
    //         for(int j  = 0; j <= i; j++){
    //              numbers[i] =  num1[j]
    //         }
    //     }

    //    System.out.println(num1[0]);
    //    System.out.println(num1[1]);
    //    System.out.println(num1[2]);
        
    // }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        // for(int i =0; i<arr.length;i++){
        //     System.out.println(arr[i]);

        // }
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        

        
    }
    
}
