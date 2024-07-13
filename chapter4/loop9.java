import java.util.Scanner;

// package chapter4;

// break  : exit loop
public class loop9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            if(i == 3){
                break; 
            }
        System.out.println(i);
        }
        System.out.print("i am out of the loop");

    }
    
}
