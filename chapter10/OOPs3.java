
// getter and setter  :
// encapsulation : wrapping  up  of  data  and  fn  under  single  entity .

public class OOPs3 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        // System.out.println(p1.color);       // cant be acesses by .color because color is private class.
        System.out.println(p1.getColor());

        p1.setTip(5);
        // System.out.println(p1.tip); // cant be acesed
        System.out.println(p1.getTip());
        


        p1.setColor("yellow");
        System.out.println(p1.getColor());

        // p1.color ="yellow";  // cant be acess private preperties
        // p1.setColor ="yellow";  // cant be done
        
    }
    
}
class Pen {
    private String color ;
    private int tip;

    // getters :  return value --->   (get)
    String getColor(){
        return  this.color;
    }
    int getTip(){
        return this.tip;
    }


    // setters : modify value  -->   ( set )
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){         // tip :  new  tip passsed / external varaiable.
        this.tip =  tip;         // more useful when same name variable .
    }


}
