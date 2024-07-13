
// package chapter13;
import java.util.*;

// Q >  for n line in  x- axix , use 2 line  to form  a container that hold max water ?



public class arrlist8 {
    public static int storeWater(ArrayList<Integer>list){
        int maxWater = 0; 
        // brute force  :
        for(int i = 0 ;  i<list.size(); i++){                                  // n times 
                 for(int j = i+1 ; j < list.size()
                 ; j++){                           // n, (n-1) ,(n-2)..... 1
                    int ht = Math.min(list.get(i), list.get(j));           // heigth is smaller of 2 lines
                
                int wt = j-i;                                              // index difference
                int currwater= ht * wt;
                 maxWater = Math.max(maxWater, currwater);
    
            }
        }
        System.out.println(maxWater);
        return  maxWater;
        
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(list);
        int max=  storeWater(list);
        System.out.println(max);
        
    }
    
}
