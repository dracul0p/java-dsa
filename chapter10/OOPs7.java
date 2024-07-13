// types of inheritance : multi- level  

public class OOPs7 {
    public static void main(String[] args) {
        Dog pitbull = new Dog();
        pitbull.eat();
        pitbull.color = "Black";
        pitbull.legs = 4;
        System.out.println(pitbull.legs);
        pitbull.breath();
    }
    
}

class Animal{
    String color;
    
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
class Mammal extends Animal { 
    int legs;

}
class Dog extends Mammal { 
    String breed;

}