
public class tut12 {
    public static void main(String  args[]) {
        short a = 5;
        byte b = 25; 
        char c = 'c';
        // type promotion :
        // byte byt = a+b+c;  // error int cant be stored to byte.
        byte bt = (byte) (a + b + c); // lossy conversion
        System.out.println(bt);
    
    }

}