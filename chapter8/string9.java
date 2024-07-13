 // Q>  String compression  ? 

public class string9 {
    public static String StringCompression(String str) {

        // by string ? 

        String newStr = "";
        for(int i = 0; i<str.length();i++){
            Integer count = 1;                               // made integer class so it can be later converted to string with help of to.string fn
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;


        // // stringBuilder
        // StringBuilder sb   = new StringBuilder("");
        // for(int i = 0 ;i<str.length();i++){
        //     Integer count = 1;
        //     while(i<str.length()-1 &&  str.charAt(i) == str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     sb.append(str.charAt(i));
        //     if(count > 1){
        //         sb.append(count.toString());
        //     }
            
        // }
        // return sb.toString();      // convert string builder to string.
}
    
    public static void main(String[] args) {
        String str = "aaabbbcccdd";
       System.out.println(StringCompression(str)); 
    }
}
