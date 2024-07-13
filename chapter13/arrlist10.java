import java.util.*;
public class arrlist10 {
    // q > find if any pair in a sorte ArrayList has a target sum? 

    // // pair sum  1 / brute force ?
    // public static boolean pairSum1(ArrayList<Integer>list , int target){
    //     for(int i = 0 ;i< list.size() ; i++){
    //         for(int j = i+1; j <list.size(); j++)  {
    //             if(list.get(i)+ list.get(j) == target){
    //                 return true;
    //             }

    //         }
    //     }
    //     return false;
    // }

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        //  optimised code :  using 2 pointer approach;
        int lp = 0 ;
        int rp = list.size()-1; 
        while(lp!= rp){    // index
            if(list.get(lp) + list.get(rp ) == target){
               return true; 
            }
            else if(list.get(lp) + list.get(rp ) <target){
                lp++;
            }else{
                rp--;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        boolean pair =pairSum2(list, target);
        System.out.println(pair);

        
    }
    
}
