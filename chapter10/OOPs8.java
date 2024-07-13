//  Hierarchial inheritance : 
public class OOPs8 {
    public static void main(String[] args) {
        Fish tuna = new Fish();
        tuna.eat();
        Mammal human = new Mammal();
        human.breath();
    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal { 
    void walk(){
        System.out.println("walks on land");
    }

}

class Fish extends Animal {
    void swim(){
        System.out.println("swims on water");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("flys on air/sky");
    }

}
