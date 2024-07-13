// calculator ?
import java.util.*;

public class tut10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("ener b:");
        int b = sc.nextInt();
        System.out.println("enter operator :");
        char operator =sc.next().charAt(0);  // TO INPUT SINGLE CHARACETR
        switch(operator){
            case '+' : System.out.println(a+b);
                    break;
            case '*' : System.out.println(a*b);
                     break;
            case '-' : System.out.println(a-b);
                     break;
            case '/' : System.out.println(a/b);
                     break;
            case '%' : System.out.println(a%b);
                     break;
            default : System.out.println("calculator is not that advance");

        }
        sc.close();
        
    }
}
