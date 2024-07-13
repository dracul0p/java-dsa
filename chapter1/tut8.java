import java.util.Scanner;

// type conversion: implicit / widening conversion.

public class tut8 {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        //int number = sc.nextFloat();  // error as int cant store float data type  lossy conversion
        float number =sc.nextInt();
        System.out.println(number);
        // int a = 10;
        // long b = a;
        // System.out.println(b);

        // long a = 10;
        // int b = a; /// error not possible conversion.
        // System.out.println(b);
        sc.close();
    }
}
