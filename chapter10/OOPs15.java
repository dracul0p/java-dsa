// Super keyword :  this.
// used to refer immediate parent class object 

public class OOPs15 {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color  );
        
    }
    
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color ="brown";
       //super(); // directly call animal class constructor. / if super is not used java by default calls super  constructor. / same output witout super()
     System.out.println("Horse constructor is called");
    }
}