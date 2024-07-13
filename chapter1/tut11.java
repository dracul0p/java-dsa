// type promotion : occurs for expresssion
import java.util.*;
public class tut11 {
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        char a ='a';
        char b ='b';
        //char c = a-b; // error a-b is int cant be converted to character
        System.out.println(a);
        System.out.println((int)a); // type casting
        System.out.println((int)b);
        System.out.println(b-a); // type promotion :convert char,byte,short oprand to int in expression like a*b+c/d
        sc.close();
    }
}
