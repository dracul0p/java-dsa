
// check if no is even or odd ?


public class bit1 {
    public static void  even_odd(int n){
        int bitmask =1;
        if((n & bitmask) == 0){
            System.out.println("even ");
        }else{
            System.out.println("odd");
        }

        
    }
    public static void main(String[] args){
        even_odd(2);
        even_odd(200);
        even_odd(5);
        even_odd(29);
       
    }
    
}
