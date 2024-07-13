// subString :

public class string5 {
    public static String subString(String str, int start , int end){
        String substr =""; // empty string
        for(int i = start; i < end;i++){
            substr += str.charAt(i);      // concatination.

        }
        return substr;

    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        String sub = subString(str, 0, 10);
        System.out.println(sub);

        System.out.println(str.substring(0,5));       // inbuilt fn to get sub string bw index
        System.out.println(subString(str, 3, 6)); // call fn
        System.out.println(str.substring( 0, 10)); // call fn
    }
    
}
 