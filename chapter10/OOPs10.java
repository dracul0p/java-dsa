
// Polymorphis :  try same thing in multiple forms.

// 1. >  compile time (method overloading)
// 2.>   run time (method overriding)


public class OOPs10 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(7,6));
        System.out.println(calc.sum(7,6.1f));
        System.out.println(calc.sum(1,2,9));

        Deer d = new Deer();
        d.eat();            // in overriding :child class  .obj . fn called so child class output. / method overriding.
    }
}
// run time  polymorphism : 
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal {
    void eat(){
        System.out.println("eats grass");
    }
}


// compile time : 
class Calculator{
    int sum(int a , int b){ 
        return a+b;
    }

    float sum(float a , float b){ 
        return a+b;
    }
    
    int sum(int a , int b, int c){ 
        return a + b + c;
    }
}
