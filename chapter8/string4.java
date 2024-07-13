// compare : string fn 

public class string4 {
    public static void main(String args[]){
        String s1 = "Tony";
        // java has a concept of interning: s2 point to s1 tony because of same value at obj level i.e tony
        String s2 = "Tony";
        String s3 = new String("Tony");  //  new:  keyWork declared new  "tony" is created 
        if(s1 == s2){   // equal at obj level 
            System.out.println("print string are equal");
        }
        else{
            System.out.println("string are not equal");
        }
        
        // == check is string value are same at object level. so   s1 not equal to s3 at object level
        if(s1 == s3){   //not equal at obj level
            System.out.println("print string are equal");

        }
        else{
            System.out.println("string are not equal");
        }

        if(s1.equals(s3)){  // compare by value of strings
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
    
}
