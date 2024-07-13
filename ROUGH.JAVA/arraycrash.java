public class arraycrash {

    // public static void pairArray(int arr[]) {
    //     for(int i=0; i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             System.out.print("("+ arr[i] + ","+ arr[j] +")");
    //         }
    //         System.out.println();
    //     }
        
    // }
    public static void subarray(int arr[]) {
        int arrSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];             
        for(int i =1; i<arr.length; i++){       // creating prefix array
            prefix[i] = prefix[i-1]+arr[i];
        }

        for(int i=0; i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                arrSum = 0;
                arrSum = (i == 0) ? prefix[j]: prefix[j] - prefix[i-1];
                // for(int k=i;k<=j;k++){
                //     // System.out.print(arr[k] + " ");

                //     arrSum += arr[k];
                // }
                System.out.println(arrSum);
                if(maxSum < arrSum){
                    maxSum = arrSum;
                }
                
            }
        }
        System.out.println("max sum is :" + maxSum);
        
        
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        // pairArray(arr);
        subarray(arr);
        
    }
    
}
