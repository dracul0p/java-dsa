// max sub array sum : brute force

public class array11 {


    public static void max_subArraySum(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0; i<number.length ;i++){
            int start = i;
            for(int j = i ; j<number.length; j++){
                int end = j;
                currSum = 0;
                for(int  k= start; k<= end; k++){   // time complixity O(n^3)
                    // sub_array sum
                    currSum += number[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum :" + maxSum);
    }
     public static void main(String[] args) {
        int number[] = {2,4,6,8,10};            //{1,-2,6,-1,3};
        max_subArraySum(number);
        
    }
    
}
