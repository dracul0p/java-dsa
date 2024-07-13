import javax.swing.plaf.synth.SynthOptionPaneUI;

// reverse an array :

public class array8 {
    public static void reverseArray(int number[]) {
        int first = 0 , last = number.length -1 ;
        while(first < last){
            // swap
            int temp = number[last];
            number[last] = number[first];
            number[first]= temp;
            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int number[] ={2,4,6,8,10};
        reverseArray(number);
        System.out.println("reverse of array :");
        for(int i = 0; i<number.length ; i++){
            System.out.print(number[i]+ " ");
        }
    }
    
}
