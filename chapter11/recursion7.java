// find first occurance of array ? 
public class recursion7 {
    public static int first_occ(int arr[], int i ,int key) {
        if(i == arr.length-1){// checked all index but key not found
            return -1;                             // key dosent exist
        }
        if(arr[i]  == key){
            return i;
        }
        return first_occ(arr, i+1, key);
    }
     public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key;
        System.out.println(first_occ(arr,  0 ,5 ));
    }
    
}
