// Abstraction  : 

import java.util.Scanner;     // package containing Scanner class.


public class OOPs11 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);  
        // int a = sc.nextInt();

        Horse h = new Horse();
        h.walk();
        h.eat();
        System.out.println(h.color);  // parent class color printed by default.
        // h.changecolor();

        Mustang myHorse = new Mustang();
            // constructor call  hiracy : Animal -> Horse-> Mustang
        

        // Chicken c = new Chicken();
        // c.walk();
        // c.eat();

        // Animal a = new animal();         / / cant create an object of abstract class animal
    }

}

abstract class Animal {
    String color;

    Animal(){    // constructor defined
        // color = "brown";
        System.out.println("animal constructor called");
    }

     void eat() {         // non - abstract
        System.out.println("animal eats");
    }
// abstraction gives idea walk not impliminated in Aniaml class
    abstract void walk();  // abstract fn : no obj / no implimintation.
}

  class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changecolor(){
        color = "white";
        System.out.println(color);
    } 


    void walk(){        // implimenting walk method of animal class.
        System.out.println("walks on 4 leges");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    void changecolor(){             // horse by default would be brown unitl change fn call
        color = "yellow";
    }

    
    void walk(){
        System.out.println("walks on 2 legs"); // implimenting walk method of animal class;
    }
}