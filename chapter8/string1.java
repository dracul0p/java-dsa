// Strings : (immutable)     

// package chapter8;

import java.util.Scanner;

public class string1 {
    public static void printLetters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println(); 
    }
    public static void main(String[] args){
        char arr[] = { 'a','b','c','d'};            // character array
        String str = "abcd";         // string
        String str2 = new String("xxyz");   // new concept
        System.out.println(str2);
        
        // Strings are : immutable
        
        // // input / output
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
        
        
        // String fullName = "Tony Stark";

        // // string is a class in java  have special associated fn

        // System.out.println(fullName.length());            // find length of string


        // concatenation : 

        String firstName ="asheesh";
        String lastName ="rawat";
        String fullName = firstName + " " + lastName;        // concatenation
        System.out.println(fullName);
        // System.out.println(fullName.charAt(0));      
        printLetters(fullName);

    }

    
}
