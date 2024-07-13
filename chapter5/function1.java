// package chapter5;
// function / methods :
/* 
// syntax :

returnType name(){
    // body
    return statment;    
}                                              */

public class function1 {
    // public static void printHelloWorld(){
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     return;                                        // for void return is not necessay
    // }
    public static int printHelloWorld(){                  // fn written inside a class are methods of that class.
        System.out.println("Hello World"); 
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 3;
    }
    public static void main(String args[]){ // public static : acces modifier /  main :  fn with no return type having string array as input.
        printHelloWorld();           // calling fn.
         
        // // body
        // System.out.println("Hello World");

        // //   work1
        // System.out.println("Hello World");
        
        // // work2
        // System.out.println("Hello World");
    }

}
