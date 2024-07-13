// inbuilt sort :
import java.util.Arrays;
import java.util.Collections;
public class sorting4 {
   // public static void InbuitSort(int arr){

//     }
//     public static void main(String[] args) {
//         int arr[] = {5,4,1,3,2};
//         // Arrays.sort(arr);
//         Arrays.sort(arr , 0 ,3);
//         for(int  i= 0; i <arr.length ; i++){  

//             System.out.print(arr[i] +  " ");
//         }
        
//     }
// }
// }

// print ARRAY IN REVERSE  : 
public static void main(String[] args) {
    Integer arr[] = {5,4,1,3,2};
    // Arrays.sort(arr);                       // 1 2 3 4 5
    // Arrays.sort(arr,0,3);                // 1 4 5  3 2    // Arrays.sort(arr,si,en)
    Arrays.sort(arr ,0, 3, Collections.reverseOrder()); // 5 4 1 3 2
    for(int  i= 0; i <arr.length ; i++){  
        System.out.print(arr[i] +  " ");
    }
}
}
