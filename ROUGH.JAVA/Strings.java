

public class Strings {
    public static boolean checkIfPanlindrome(String str) {
        for(int i = 0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){

                return false;
            }
            
            
        }
        return true;
        
    }
    public static void main(String[] args){
        String Str = "racecar";
        boolean yo = checkIfPanlindrome(Str);
        System.out.println(yo);
        

    }
    
}
