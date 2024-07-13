// package chapter13;

import java.util.ArrayList;

public class arrlist2 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("size of arraylist : " + " = " +  list.size());  // size of arraylist =  list.size()

        for(int i = 0; i<list.size() ;i++){   //print element of arraylist using loop
            System.out.println(list.get(i)); 
        }
        for(int i = list.size()-1 ; i>=0 ;i--){   //print element of arraylist  in reverse using loop
            System.out.println(list.get(i)); 
        }
    }
    
}
