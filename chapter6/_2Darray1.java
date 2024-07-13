 import java.util.Scanner;

// 2Darray : important ques basics

public class _2Darray1 {
    public static boolean searchKey(int matrix[][], int key) {
        for(int i = 0; i < matrix.length ;i++ ){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("element found at cell / index : ("+ i +"," + j +")");
                    return true;

                }           
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length;          // no of rwos
        int m = matrix[0].length;    // no of cols
        for(int i = 0; i<n ;i++ ){
            for(int j = 0; j<m; j++){
                matrix[i][j]= sc.nextInt();  // input
            }


        }
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " "); // output
            }
            System.out.println();
        }
        int key = 3;
        boolean search = searchKey(matrix , key);
        System.out.println(search);
        
        System.out.println(n);
        System.out.println(m);
        
    }
    
}
