 // Hybrid inheritance :

public class OOPs9 {
    public static void main(String[] args) {
        Crow c = new Crow();
        c.eat();
        c.fly();
        Shark s = new Shark();
        s.breath();
        s.fish = "dolphin";
        System.out.println(s.fish);
        
    }
    
}

class Animal{
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
class Fish extends Animal{
     void swims(){
        System.out.println("swim in water");
     }
}
class Tuna  extends Fish{
    String fish;
}
class Shark extends Fish{
    String fish;
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class Crow extends Bird{
    String fly;
}
class Peacock extends Bird{
    String notFly;
}