// package chapter13;
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class arrlist1 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(); // creating array list
        list.add(1);  // add element to array list
        list.add(2);
        list.add(3); 
        list.add(4); 
        list.add(5); 
        System.out.println(list); // print array list

        int  x= list.get(2);   // get element at given  index
        System.out.println(x);
        // or 
        System.out.println(list.get(0)); 
        System.out.println(list); 

        // list.remove(1);  // remove array list element form given index
        // System.out.println(list); 

        list.set(1 , 20);  // set new element at given index
        System.out.println(list);

       boolean  y = list.contains(1);    // check element exist or not; // true or false output
      System.out.println(y);
      
       System.out.println(list.contains(30));   //o = element to check


        
    }
    
}
