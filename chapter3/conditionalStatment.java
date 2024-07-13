// CONDITIONAL STATMENT :
// 1.   if-else statment :

/* 
if (condition){
    
}
else{

}                 */
/* 

// 2 else if statment 
if(condition1) {

}
else if(condition 2){

}  
else {

}                */


public class conditionalStatment {
    public static void main(String[] args) {
        int age = 16;
        if(age>=18){
            System.out.println("adult");
            System.out.println("vote");
            System.out.println("can drive");
        } 
        if(age >13 && age <  18){
            System.out.println("teanage");

        }
        else{
            System.out.println("not adult");
        }
    }
    
}
