// convert from decimal to binary : 

public class function11 {
    public static void  decToBin(int decNum){
        int myNum = decNum ;
        int pow = 0;
        int binNum = 0 ;
        while(decNum >0 ){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)(Math.pow(10 ,pow)));
            pow ++;
            decNum = decNum / 2 ;
        }
        System.out.println("binary form of  " + myNum + " = " + binNum);
    }
    public static void main(String[] args) {

     decToBin(5);

        
    }
    
}
