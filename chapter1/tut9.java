// type casting: force full conversion./ narrowing /explicit conversion

import java.util.*;
public class tut9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // float a=25.0;
        // int b = a;  // error due to data loss lossy conversion

        float a = 25.12f;
        int b = (int) a;
        System.out.println(b);

        float marks =99.99f;
        int marks2= (int) marks;
        System.out.println(marks2);
        sc.close();
        
    }
}