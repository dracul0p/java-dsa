// chack is array is sorted  ? 
public class recursion6 {
    public static boolean isSorted(int arr[] , int i) {
        if(i == arr.length-1){     // base case                          //  arr = {5}  1 digit array
            return true;
        }

        if(arr[i] > arr[i+1] ){ // condition
            return false;
        }
          // else true 
        return isSorted(arr , i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
}
