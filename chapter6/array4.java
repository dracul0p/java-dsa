//  liner search for string value :  

public class array4 {
    public static  int linearSearch1(String menu[], String key1){
        for(int i = 0 ; i<menu.length; i++){
            if(menu[i] == key1){
                return i;
            }
            
            
        }
        return -1;   // key  dosent exist
    }
    public static void main(String[] args) {
        // menu of hotel
        String menu[] = {"samosa" , "dosa" , "chole bature" };
        String key1 = "samosa";
         
        
        int index1 = linearSearch1(menu, key1);  
        if(index1 == -1){
            System.out.println("not found");
        }
        System.out.println("key is at index :" + index1);
        
        
    
}

}