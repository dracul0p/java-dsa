
// String builder : created at once amd  can be modied at same momory . 
// used to remove disadvantage of Strings .

public class string7 {
    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder("");           // we can initislise it or keep it null / empty string initialise.
        for(char ch ='a'; ch<='z'; ch++){
            sb.append(ch);
            // abcdefghijk.....z  
        }  
        // O(26)
        System.out.println(sb);
        System.out.println(sb.length());
    }

    
}
