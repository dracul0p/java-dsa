// inheritance  ---> : when properties & methods of base class are passed on to derived class .
// type :  singel , multi , hierarchial ,hybrid level.

// eg . eat property of parent class is passed to child class by fn calling .

// 1 .> single level inheritance  
public class OOPs6 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat(); // fn call 
        
    }
    
}

// base class:
class Animal{
    String color;
    
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
// derived class  / sub class / child class :
class Fish extends Animal{
    int Fins;
    void swim(){
        System.out.println("swims in water");
    }

}
