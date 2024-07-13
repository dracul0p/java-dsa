// package chapter13;

//  multi dimensional  array list 
import java.util.*;
public class arrlist6 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist=  new ArrayList<>();
        ArrayList<Integer> list1 =  new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainlist.add(list1);
        System.out.println(list1);
        
        ArrayList<Integer> list2=  new ArrayList<>();
        list2.add(3);
        list2.add(5);
        mainlist.add(list2);
        
        System.out.println(list2);
       
        
        System.out.println(mainlist);
        // or 
        for(int i = 0; i<mainlist.size(); i++){
            ArrayList<Integer>currentlist = mainlist.get(i);
            for(int j = 0 ; j<currentlist.size(); j++){
                System.out.println(currentlist.get(j) + " ");

            }
            System.out.println();

        }

    }
    
}
