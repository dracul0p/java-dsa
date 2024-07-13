// last occurannce ? 

public class recursion8 {
    public static int last_occ(int arr[], int i , int key){
         
        last_occ(arr, i+1,key);

        
    }
    public static void main(String[] args) {
        int arr[]= {8,3,6,9,5,10,2,5,3};
        int key = 5;
        last_occ(arr, 0, 5);
    }
    
}
