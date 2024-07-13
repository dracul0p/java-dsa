// no is prime or not ? 

// public class function9 {
//     public static boolean isPrime(int n){
//     boolean isPrime = true;
//     for(int i=2; i<n; i++){
//         if(n % 2 == 0){
//             isPrime = false;
//             break;
//         }
//     }
//     return isPrime;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(20));
        
//     }
// }


// public class function9 {
//     public static boolean isPrime(int n){
//         if(n==2){          // corner cases :
//             return true;
//         }

//         for(int i=2; i<n; i++){
//         if(n % 2 == 0){
//             return false;
//         }
//     }
//     return true;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(2));
        
//     }
// }



// optimised loop :
public class function9 {
    public static boolean isPrime(int n){
        if(n==2){          // corner cases :
            return true;
        }
        
        for(int i=2; i<Math.sqrt(n); i++){
        if(n % 2 == 0){
            return false;
        }
    }
    return true;
    }

    // print prime in range  ? 

    public static void primeInRange(int n){
        for(int i = 2 ; i<=n; i++){
            if(isPrime(i)){ // true    //call is Prime fn
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println(isPrime(20));
        primeInRange(20);   // 2 to 20 prime 
    }
}
    
    
        
