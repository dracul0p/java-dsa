// SCOPE :

//1. METHOD SCOPE : variable inside a fn have scope only inside that fn.
//2. BLOCK SCOPE :
public class function12 {
    public static void main(String[] args) {
        for(int i= 1 ; i<=5; i++){

        }
        System.out.println(i); // error

        int p =20;
        System.out.println(s); // error
        {
            int s =12;
            System.out.println(s); //  block scope
            System.out.println(p);
        }
        System.out.println(s); // error
          System.out.println(p);
    }
    
}
