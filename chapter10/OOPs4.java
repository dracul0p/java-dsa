 // constructor  : invoked automatically at time of object creation .
// types of constructors :  parametrize , non-parametriz ,copy constructor.

// Polymorphise : multiple form single name /  constructor over-loading.


public class OOPs4 {
    public static void main(String[] args) {

        // constructors over-loading . 
    student s2 = new student();    
    student s1 = new student("asheesh rawat");  // new student() obj created with help of constructor.   
                    // initiallisation.
    System.out.println(s1.name);
    

    student s3 = new student(30);    
    System.out.println(s3.age);
              
    // student s4 = new student("ashe" , 30);      // error no such constructor exist.
} 
    
}

class student{
    String name;
    int age;

    student() {                                                   // non parematrized constructors.
        System.out.println("constructor is called...");               
    }


 // to inatiallise student/object  we make constructor ;
    student(String name) {                                            // parametrized constructors .
        this.name = name;
    }
    
    student(int age) {                                               // parametrized constructors .
        this.age = age;
    }
}