// package chapter10;

// class & object  : 
public class OOPs1 {
    public static void main(String[] args) {// 
        // create pen object called p1
        Pen p1 = new Pen();      // new make space in memory to store all pen properties | class name pen() is constructor
        p1.setColor("red");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        // p1.setColor("yellow");
        p1.color ="yellow";
        System.out.println(p1.color);

        Student S = new Student();
        S.calculatePercentage(25, 25, 25);
        System.out.println(S.percentage);


        
    }
}
// pen blueprint 
class Pen {            // properties and fn
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;

    }
    void setTip(int newTip){
        tip = newTip;
    }
    
}

class Student {
    String name;
    int age;
    float percentage; // cgpa

    void calculatePercentage(int phy,int chem,int math){
        percentage = (phy + chem + math)/3;
    }
}
