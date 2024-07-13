    import java.util.Arrays;

// quickSort ? 
public class QuickSort {
    public static void printArr(int arr[]) {
        System.out.println(Arrays.toString(arr));
        // for(int i =0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");

        // }
    }
    public static void QuickSort(int arr[] ,int si, int ei) {
        if(si>=ei){
            return;
        }
     // kaam = pivot ---> last element
        int pidx = partition(arr, si ,ei);
        QuickSort(arr ,si,pidx-1); // left
        QuickSort(arr ,pidx+1,ei); // rigth  
    }
    public static int partition(int arr[], int si ,int ei) {
        int pivot = arr[ei];
        int i = si-1; // to make space for element smaller than pivot. -1
        for(int j =si ; j<ei; j++){
            if(arr[j]< pivot){
                i++;
                // swap 
                int temp =arr[j];
                arr[j] = arr[i];
                arr[i] = temp ;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];  // dont do  pivot = arr[i] i.e value will be assignt to variable; 
        arr[i] = temp ;    
        return i;

    }
        

    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        QuickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
