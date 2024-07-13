import java.util.Scanner;

// Q > . PASS OR FAIL ?
public class tut8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String status = (marks >= 30) ? "pass": "fail" ;
        System.out.println(status);
        sc.close();

    }
    
}
