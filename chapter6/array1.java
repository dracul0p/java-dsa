import java.util.Scanner;

// package chapter6;
// array :list of element of same type placed in  contigeous memory location.

public class array1 {
    public static void main(String[] args) {

        // creat array :
        // int marks[] = new int[50];   //static : array  charactristic.// size = 50;
        // int number[]= {1,2,3};
        // String fruit[]= {"apple","mango","orange"};

        // input in array: 
        int marks[]= new int[100];                                  // creating an array

        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();        
        marks[0]= sc.nextInt(); // phy                                  // input in array
        marks[1]= sc.nextInt(); // chem
        marks[2]= sc.nextInt(); // maths
        
        
        
        // length of array :
        int marks1[]= {1,2,3};
        System.out.println("length of array :" + marks1.length);

        System.out.println("phy : "   + marks[0]);                       // output in array
        System.out.println("chem : " + marks[1]);
        System.out.println("math : "  + marks[2]);

        marks[2]= marks[2]+1;                                             // updating value
        System.out.println("math : " + marks[2]);

        int percentage = (marks[1]+ marks[2]+ marks[0])/3;
        System.out.println("percentage : "+ percentage + "%");

    }
}
 