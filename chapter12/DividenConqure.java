// package chapter12;

public class DividenConqure {
    public static void printArr(int arr[]) {
        for(int i =0 ; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[] , int si ,int ei){         // recursive fn
        if(si >= ei){
            return;
        }
        // kaam mid:
        int mid = si+(ei-si)/2;        // mid = (si + ei) /2

        mergeSort(arr, si, mid);        // left part    call
        mergeSort(arr, mid+1, ei);     // rigth part    call
        
        merge(arr ,si ,mid, ei);       // mege left and rigth sorted arrays
    }

    public static void merge(int arr[] , int si ,int ei ,int mid){
    // size of temp[] ---> left(0,3)= 4 elements  right(4,6) = 3 elements  ==>  size = 4+3 = 7 i.e  6-0+1 = 7
    int temp[] = new int[ei - si + 1 ];   // +1 because array is 0 base indexed
    int i = si;       //iterator of left
    int  j = mid+1;  //  iterator of right
    int k = 0;       // iterator  for temperory

    while(i<= mid && j<=ei ){
        if(arr[i] < arr[j]){
            temp[k] = arr[i];
            i++;
        }else{
            temp[k] = arr[j];
            j++;
        }
        k++;

    }
    // for leftover element of 1st sorted part
    while(i <= mid){
        temp[k++]= arr[i++];

    }
    // for leftover element of 2nd sorted part
    while(j <= ei){
        temp[k++]= arr[j++];

    }
    for( k = 0  , i = si ;  k < temp.length; k++ , i++){
       arr[i]= temp[k];
    }

    }

    public static void main(String[] args) {
        int arr[] ={6,3,9,5,3,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);

    }
    
}
