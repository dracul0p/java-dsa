// Q 12. >   remove dublicate from string ?  :    ----->   "appnnacollege"
public class recursion12 {
    public static void  removeDublicates(String str ,int idx, StringBuilder newStr,boolean map[]) {
        if(idx == str.length()-1){
            System.out.println(newStr);
            return;
        }
        // kaam 
        char currchar = str.charAt(idx);
        if(map[currchar -'a'] == true){
            //  currchar is  dublicate
            removeDublicates(str, idx+1, newStr, map);
        } else {
            map[currchar -'a'] = true;
            removeDublicates(str, idx+1, newStr.append(currchar), map);
        }
        
    }
    public static void main(String[] args) {
        String str = "appnnacollage";
        System.out.println(str.length());
        removeDublicates(str, 0 , new StringBuilder("") , new boolean[26]);
        
    }

    
}
