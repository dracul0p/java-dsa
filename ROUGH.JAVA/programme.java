import java.util.Scanner;

import javax.xml.transform.Source;

public class programme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // fibonacci series 
        int n =sc.nextInt();
        int fib =0;
        for(int i = 0; i<n; i++){
            fib = fib + i;
            System.out.println(fib);
        }

        // float rupees = sc.nextFloat();
        // float USD =  rupees / 79.4f;
        // System.out.println(USD);
        
        // int a  = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("enter operator : ");
        // char operator =sc.next().charAt(0);
        // if(operator == '+'){
        //     System.out.println(a+b);
        // }
        
        // if(operator == '*'){
        //     System.out.println(a*b);
        // }
        
        // if(operator == '-'){
        //     System.out.println(a-b);
        // }
        
        // if(operator == '/'){
        //     System.out.println(a/b);
        // }
        

        // simple intrest 
        // int p = sc.nextInt();
        // int r = sc.nextInt();
        // int t = sc.nextInt();
        // int simpleInterst = (p*r*t) / 100;
        // System.out.println(simpleInterst);



        // greeting
        // String name = sc.nextLine();
        // System.out.println(" hellow " + name );



        // even odd :
        // int n = sc.nextInt();
        // if(n % 2 == 0){
        //     System.out.println("even");
        // } else {
        //     System.out.println("odd");
        // }

    }
}
