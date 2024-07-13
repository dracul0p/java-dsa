import java.util.Scanner;

public class strign1 {
    public static void main(String[] args) {

        // input array of string from user & find culative lenght  of all string
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr[] = new String[size];
        int length = 0;
        for(int i= 0; i<arr.length;i++){
            arr[i]=sc.next();
            length += arr[i].length();
        }
        System.out.println(length);
         
        
    }
    
}
