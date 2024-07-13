// convert from binary to decimal :

public class function10 { 
    public static  void  binaryToDec(int binNum){
        int myNum = binNum ;
        int pow = 0;
        int decNum = 0;
        while(binNum > 0 ){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)(Math.pow(2 ,pow)));
            binNum = binNum / 10;
            pow ++ ;
        }
        System.out.println("decimal of " +  myNum +" = "+ decNum);
        

    }
    public static void main(String[] args) {
        binaryToDec(1010);
        
    }
}
