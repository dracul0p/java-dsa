import java.util.Scanner;

// package chapter5;

// FUNCTION CALL :

// public class function2 {
//     public static void calculateSum(){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println("sum is :" + sum);
        
//     }
//     public static void main(String[] args) {
//         calculateSum();          // FUNCTION CALL

        
//     }
    
// }

// // CALLING FUNCTION AFTER PASSING VALUE AS PARAMETER INSIDE FUNCTION : 
// public class function2 {
//     public static void calculateSum(int num1 , int num2){       //2 .receving numbers a and b as parameter.
//         int sum = num1+num2;                                   //3. sum calculated
//         System.out.println("sum is :" + sum);                 //4. after fn call output
        
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         calculateSum(a , b);                      // 1. numbers passed in fn as input.    calling fn

        
//     }
    
// }


// return value of fn  :
public class function2 {
    public static int calculateSum(int num1 , int num2){  
        int sum = num1 + num2;                 
        return sum;           // value return to fn that has called it , eg main()
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a , b);          
        System.out.println("sum is :" + sum);  

        
    }
    
}
