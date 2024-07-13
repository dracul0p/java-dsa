// Q > find  if any pair in a (sorted & rotated } ArrayList has a target sum ? 
import java.util.*;
class arrlist11{

    public static boolean pairSum3(ArrayList<Integer>list , int target){
        int pb = -1;  // not a valid index
        int n = list.size();
        for(int i = 0; i<list.size() ;i++){
            if(list.get(i)> list.get(i+1)){  // breaking point
                 pb = i;

                 break;
            }
        }
        System.out.println("breaking point is :" + pb);
        int lp = pb+1; // smallest element
        int rp = pb; // largest  element
        while(lp!=rp){  
            if(list.get(lp)+ list.get(rp) == target){
                return true;
            }
            else if(list.get(lp)+ list.get(rp) < target){
                lp =(lp+1) % n;  // modular arithmetic  for sorted and rotated array


                
            }else{
                rp = (n+rp -1) % n ;
            }
 
        }
        return false;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 15;
        System.out.println(pairSum3(list, target));

        
    }
}