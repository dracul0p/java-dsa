// Diagonal sum: 

public class _2Darray3 {
    // public static int diagonalSum(int arr[][]) {
    //     // sum of element of primary diagonal 
    //     int sum = 0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0; j<arr[0].length;j++){
    //             if(i==j){  
    //                sum += arr[i][j];
    //             }
    //             else if((i+j ) == (arr.length -1)){
    //                 sum += arr[i][j];
    //             }
                

    //         }
    //     }
    //     return sum;
        
        
    // }
    public static int diagonalSum(int arr[][]) {
        // optimised loop : t.c = O(N^2)
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            //pd:
            sum += arr[i][i];
            // sd:  i+j= n-i   i.e : j = n-i-1
            if(i != arr.length-i-1){     // remove element overlaping element from  secondary diagonal  
               sum += arr[i][arr.length-i-1];  // actual sum = 24 but sum of diagonal for odd case is :20 
            }

        }
        return sum;

    }
    
    public static void main(String[] args) {
        // int arr[][]={{1,2,3,4}, // arr = square matrix
        //              {5,6,7,8,},
        //              {9,10,11,12},
        //              {13,14,15,16}};
        int arr[][]={{0,1,2}, // arr = square matrix
                     {3,4,5},
                     {6,7,8}};
        int sum = diagonalSum(arr);
        System.out.println("sum of diaginal of array :" + sum);

    }
        
}
    

 