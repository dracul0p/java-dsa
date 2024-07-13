// search in sorted matrix 

public class _2Darray4 {
    // public static boolean searchInSorted_Matrix(int matrix[][] , int key) {
    //     int row = 0 , cols = matrix[0].length-1;
    //     while(row < matrix.length && cols >= 0){
    //         if(matrix[row][cols] == key){
    //             System.out.println("found key at ("+ row + " , " + cols +" )");
    //             return true;
    //         }
    //         else if(key < matrix[row][cols]){
    //             cols--;    // move left
    //         }
    //         else{
    //             row++; // move down
    //         }



    //     }
    //     System.out.println("key not found !");
    //     return false;
        
    // }
    public static boolean searchInSorted_Matrix(int matrix[][] , int key) {
        int row = matrix.length-1 , cols = 0;
        while(row >= 0 && cols < matrix[0].length){
            if(matrix[row][cols] == key){
                System.out.println("found key at ("+ row + " , " + cols +" )");
                return true;
            }
            else if(key < matrix[row][cols]){
                row--;    // move top
            }
            else{
                cols++; // move rigth
            }



        }
        System.out.println("key not found !");
        return false;
        
    }
    public static void main(String[] args) {
        int matrix[][]= {{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}};
        int key = 32;
        boolean search= searchInSorted_Matrix(matrix, key);
        System.out.println(search);
        
    }
    
}
