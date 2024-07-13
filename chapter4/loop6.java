

// package chapter4;
//Q. print reverse of a number ?  n = 10899
public class loop6 {
      public static void main(String[] args) {
       int n = 10899 ;
       int  last_digit ;
        while(n > 0) {
            last_digit = n % 10 ;
            System.out.print(last_digit + "" );
            n = n / 10;
            
            
        }
        System.out.println();
      }
    
}
