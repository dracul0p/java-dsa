// Q14 > print all binary string of size N without  consecutive ones ?
public class recursion14 {
    public static void binaryStrings(int n,int lastPlace , String str) {
        // base  case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // kaam  
        // if(lastPlace == 0 ){
        //     binaryStrings(n-1, 0, str +='0' );
        //     binaryStrings(n-1, 1, str +='1' );
        // }else{
        //     binaryStrings(n-1, 0, str+='0');
        // }

        binaryStrings(n-1, 0, str +='0' );
        if(lastPlace == 0){
            binaryStrings(n-1, 1, str +='1' );
        }
    }
    public static void main(String[] args) {
        binaryStrings(4,0, "") ;
        
    }
    
}
