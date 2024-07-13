// package chapter5;
import java.util.Scanner;
// ARGURMENTS  AND PARAMETERS ? 

public class function3 {
    public static int calculateSum(int num1 , int num2){   // PARAMETER  /  FORMAL PARAMETER
        int sum = num1 + num2;                 
        return sum;           // value return to fn that has called it , eg main()
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a , b);           // ARGUMENTS / ACTUAL PARAMETER
        System.out.println("sum is :" + sum);  

        
    }
    
}


