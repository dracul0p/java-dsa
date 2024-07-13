// package chapter13;

import java.util.*;

// sorting in arrray list
public class arrlist5 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(100);
        list.add(1);
        list.add(23);
        list.add(3);
        System.out.println(list);
        Collections.sort(list);    // ascending oreder sort
         // collections  :class
        System.out.println(list);
        Collections.sort(list ,Collections.reverseOrder());  // reverse sort
        System.out.println(list);
    }
    
}
