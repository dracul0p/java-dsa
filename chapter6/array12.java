// max sub array sum 
// prefin sum  : 

public class array12 {


    public static void max_subArraySum(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        // calculate prefix array
        for(int i = 1; i <prefix.length ; i++){
            prefix[i] = prefix[i-1] + number[i];

        }

        for(int i =0; i<number.length ;i++){
            int start = i;
            for(int j = i ; j<number.length; j++){
                int end = j;
                currSum = 0;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
  

                // for(int  k= start; k<= end; k++){   // time complixity O(n^3)
                //     // sub_array sum
                //     currSum += number[k];
                // }

                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            // System.out.println();
        }
        System.out.println("max sum :" + maxSum);
    }
     public static void main(String[] args) {
        int number[] = {6,-1,3};            //{1,-2,6,-1,3};
        max_subArraySum(number);
        
    }
    

}

    
    


  