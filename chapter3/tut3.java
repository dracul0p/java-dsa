
// Q > print no is even or odd ?
import java.util.*;
public class tut3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println(a);
        if(a % 2 !=0 ){
            System.out.println("no. is odd");
        } else {
            System.out.println("no. is even");
        }
        // if(a % 2 == 0){
        //     System.out.println("no is even");
        // } else{
        //     System.out.println("no is odd");
        // }
        sc.close();
    }
}
