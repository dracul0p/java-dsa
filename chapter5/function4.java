// package chapter5;
// SWAP TWO NUMBERS 

// public class function4 {
    //     public static void main(String[] args) {
//         // swap - value exchange 
//         int a = 5;
//         int b =10;
//         // swap 
//         int temp =a;
//         a = b;
//         b = temp;
//         System.out.println("a ="+ a);
//         System.out.println("b ="+ b);

//     }

// }


// call by value : java alwaya call by value 
public class function4 {
    public static void swap(int a , int b){
        int temp =a;
        a = b;
        b = temp;
        System.out.println("a ="+ a);         // call by value : copy of argument
        System.out.println("b ="+ b);
    }
    public static void main(String[] args) {
        // swap - value exchange 
        int a = 5;
        int b = 10;
        // swap 
       swap(a,b); // call fn
       System.out.println("a = " + a);
       System.out.println("b = " + b);
        
    }
    
}
