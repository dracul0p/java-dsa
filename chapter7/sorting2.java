/ selection sort :

public class sorting2 {  
    public static void selection_sortArr(int arr[]) {
        for(int i = 0; i<arr.length-1; i++){ // turns
            int minVal = i;
            for(int j = i+1; j < arr.length ; j++){
                if(arr[minVal] > arr[j]){         // change sign to reverse the  order.
                    minVal = j;
                }
            }
            // swap
            int temp = arr[minVal];
               arr[minVal] = arr[i];
               arr[i] = temp;
            
        
        }
    }
    public static void printArr(int arr[]) {
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[] = { 5,4,1,3,2};
        selection_sortArr(arr);
        printArr(arr);

        
    }
    
}
