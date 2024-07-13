// hw.ques  

public class hw_2Darray {  
    // transpose of  matrix  ? 
    public static void transpore_of_arr(int arr[][]) {
        int trans_arr[][] = new int[arr.length][arr[0].length];
        for(int i = 0; i<arr.length;i++){
            for(int j =0 ;j< arr[0].length;j++){
                trans_arr[j][i] = arr[i][j];
            }
        }
        System.out.print("transpose of arr :"+ trans_arr);
        
    }
    public static void main(String[] args) {
        int arr[][] = {{2,3,7},{5,6,7}};
        transpore_of_arr(arr);
        for(int i =0; i<arr.length;i++){
            for(int j =0 ;j< arr[0].length;j++){
                System.out.println(trans_arr[j][i]);
            }
        }  
        
    }
    // public static int sum_of_noSecond_row(int arr[][]) {
    //     int sum = 0;
    //         for(int j = 0 ; j<arr[0].length;j++){
    //             sum += arr[1][j];

    //         }
        
    //     return sum;
        
    // }
    // public static void main(String[] args) {
    //     int arr[][] ={{1,4,9},{11,4,3},{2,2,3}};
    //     int sum = sum_of_noSecond_row(arr);
    //     System.out.println("sum of arrayof second row:" + sum);
    // }


    // // count no of  7 is array ?

    // public static void no_of7(int arr[][] ,int key) {
    //     int count_7 = 0;
    //     for(int i = 0 ; i<arr.length; i++ ){
    //         if(key == 7){
    //             count_7++;
    //         }

    //     }
    //     System.out.println("no_of 7 : "+ count_7);
        
    // }
    // public static void main(String[] args) {
    //     int arr[][] = {{4,7,8},{8,8,7}};
    //     int key  = 7;
    //     no_of7(arr , key);
    // }
    
}
