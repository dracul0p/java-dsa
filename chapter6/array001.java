import java.util.Arrays;
import java.util.Scanner;

import javax.xml.transform.Source;

public class array001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input in 2d array 
       int arr[][] = new int[3][3];
       System.out.println(arr.length);
       for(int row = 0; row< arr.length ; row++) {
        // for each col in row
            for(int cols = 0; cols < arr[row].length; cols++){
                arr[row][cols] = sc.nextInt(); 
                
            } 
        }
        // output 
    //    for(int row = 0; row< arr.length ; row++) {
    //         for(int cols = 0; cols < arr[row].length; cols++){
    //             System.out.print(arr[row][cols]+ " ");
    //         } 
    //         System.out.println();
    //     }
        
       for(int row = 0; row< arr.length ; row++) {
           System.out.println(Arrays.toString(arr[row]));
            // for(int cols = 0; cols < arr[row].length; cols++){
            //     System.out.print(arr[row][cols]+ " ");
            // } 
            // System.out.println();
        }
        






        // int arr[] = new int[5];
        // for(int i = 0; i<arr.length; i++){         // input array
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));  // print array

        //       // for(int i = 0; i < arr.length; i++){
        // //     System.out.print(arr[i] + " ");
        // // }

        //   //    enhance for loop 
        // for(int num : arr) { // for every elememt in array print the element
        //     System.out.print(num + " "); // here num represent element of the array
        //     }

        

        // String arr1[] = new String[5];
        // for(int i = 0; i<arr1.length; i++){         // input array
        //     arr1[i] = sc.nextLine();
        // }

        // System.out.println(Arrays.toString(arr1));  // print array


  
    }

    
}
