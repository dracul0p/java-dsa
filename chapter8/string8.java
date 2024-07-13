
// Q> for a given string convert each the first letter of each word to upper case ?     (company : CODE NATION)  ... Very....imp 
public class string8 {
    public static String firstLetterUpper(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);    // first character to string buil
        for(int i = 1; i<str.length();i++){
            if(str.charAt(i) == ' '  &&   i<str.length()-1){
                sb.append(str.charAt(i));
                i++; 
                sb.append(Character.toUpperCase(str.charAt(i)));
                
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);               // output
        
        return sb.toString();              // convert any object to string i.e convert StringBuilder --> Sting 
        
    }
    public static void main(String[] args){
        String str = "hi i am asheesh";
        String newString = firstLetterUpper(str);
        System.out.println(newString);           // output

 }
}
