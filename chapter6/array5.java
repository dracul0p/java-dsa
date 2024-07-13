// largest no :

public class array5 {
    public static int largest_no(int number[]){
        int largestNo = Integer.MIN_VALUE;  // -infinity 
        int smallestNo = Integer.MAX_VALUE;  // + infinity 
        for(int i = 0; i<number.length; i++){  // time complixibity big on  n /    O(n)
            if(largestNo < number[i]){
                largestNo = number[i];
                         }
            if(smallestNo > number[i]){
                smallestNo = number[i];

            }

        }
        System.out.println("smallest no  is :" + smallestNo);
        return largestNo;
    }
    public static void main(String[] args) {
        int number[] ={1,2,6,3,5,};
        int largest = largest_no(number);
        System.out.println("largestn no : " + largest);
        
    }
    
}
