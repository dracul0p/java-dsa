// reverse a string  ::; pata nhi error kyu aaaraa 

public class stringbuilder {
    public static void main(String[] args) {
        String sb = new String("asheesh");
        for(int i=0;i<sb.length()/2;i++){
            int first = i;
            int last = sb.length() - i - 1;

            char firstchar = sb.charAt(first);
            char lastchar = sb.charAt(last);


        }
        sb.setCharAt(first ,lastchar);
        sb.setCharAt(last,firstchar);
        System.out.println(sb);


        // String reverse = new String("");
        
        // for(int i=sb.length()-1;i>=0;i--){
        //     reverse +=sb.charAt(i);


        // }
        // System.out.println(reverse);
    
        
        
    }
    
}
