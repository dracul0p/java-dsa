// q.>  compare strings in lexicographic order, print largest string ?

public class string6 {
        
    
    public static void main(String[] args) {
        /// compare lexicographic order : first letter is compared of every fruit
        String fruits[] = {"Apple","banana", "mango"};
        String largest = fruits[0];    
        for(int i = 1 ; i < fruits.length ; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
          
        }
        System.out.println(largest);
    }
    
}
