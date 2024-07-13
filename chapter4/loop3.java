import java.util.Scanner;

// package chapter4;
// sum of n natural no. ?
public class loop3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1 ;
        int sum = 0;
        int num =  sc.nextInt();
        while(i <= num) {
            sum += i;
            i++;
        }
        System.out.println("sum is :" + sum);

    }

    
}
