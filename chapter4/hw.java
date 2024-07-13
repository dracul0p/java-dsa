import java.util.Scanner;

// loops questions ?

public class hw {
    public static void multiplicationTable(int n){
        // Scanner sc = new Scanner(System.in);
        System.out.println("the table of no " + n + " is :");
        int table ;
        for(int i = 1 ; i <=10 ; i++){
            table = n * i;

            System.out.println( table);
        }



    }
    public static void main(String[] args) {
        multiplicationTable(2);
        
        

        // write a program to print the multiplication table of a number N ,entered by the user ?
        
        // //  factorial of a no ?
        // Scanner sc = new  Scanner(System.in);
        // int n = sc.nextInt();
        // int  f = 1;
        // for(int i =1; i<=n ; i++){
        //     f = f * i;
        // }
        // System.out.println("factorial = " + f);




        // // write a program that read set of integer and then print sum of the even and odd integer ?



        // Scanner sc = new Scanner(System.in);
        // int num;
        // int evenSum = 0;
        // int oddSum = 0;
        // int choice;
        // do{
        //     System.out.println("enter the no :");
        //     num = sc.nextInt();
        //     if(num % 2 == 0){
        //       evenSum += num;
        //     } else {
        //         oddSum += num;
        //     }
        //     System.out.println("if you want to print no choice = 1 and if not choice = 0");
        //     choice = sc.nextInt();
        // }while(choice == 1) ;
        // System.out.println("sum of even no :" + evenSum);
        // System.out.println("sum of odd no :" + oddSum );



        // check out put ?
        // for(int i = 0 ;i < 5; i++){
        //     System.out.println("hello");
        //     i +=2;
        // }
        
    }
    
}
