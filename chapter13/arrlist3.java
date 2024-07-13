// package chapter13;
import java.util.*;

// Q   find maximum in arraylist ? 
public class arrlist3 {
    public static void reverselist(ArrayList<Integer>list ) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size() ; i++){
            // if(max < list.get(i)){
            //     max = list.get(i);

            // }
            // OR      
            max = Math.max(max ,list.get(i));
            
        
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        reverselist(list);  // fn call


    }
    
}
