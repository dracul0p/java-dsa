// FUNCTION OVERLOADING  :\

// public class function8 {
//     // fn to  calculate sum of two no :
//     public static int sum(int a, int b){
//         return a+b;
//     }
//     // fn to calculate sum of 3 no: 
//     public static int sum(int a, int b, int c){
//         return a+b+c;
//     }
    
//     public static void main(String[] args) {
         
//         System.out.println(sum(3,5));
//         System.out.println(sum(3,5,1));
//     }
// }


// operator overloading 
public class function8 {
    // fn to  calculate sum of two int :
    public static int sum(int a, int b){
        return a+b;
    }
    // fn to calculate sum of 2 float: 
    public static float sum(float a, float b ){
        return a+b;
    }
    
    public static void main(String[] args) {
         
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f,5.2f ));
    }
}
