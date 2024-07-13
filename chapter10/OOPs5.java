// copy constructors : 

// destructors / garbaje   :  removed unused obj randomly.
public class OOPs5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "asheesh";
        s1.age = 20;
        s1.Password ="hwhe";
        s1.marks[0] =100;
        s1.marks[1] =100;
        s1.marks[2] =100;
     
        Student s2 = new Student(s1);  // copy s1 to s2 
        s2.Password ="xyz";

        s1.marks[2] = 0; // change  in s1 after copy to s2 . ideally change  should not be present   in s2 .(deep copy)/  but if is present. / shallow copy.
         
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}  
   
class Student{
    String name;
    int age;
    String Password;
    int marks[];

    // Address city;       / address object of class Adress .
    // class Address{
    //     String city;
    // }

    // shallow-copy constructor: 
    
    // Student(Student s1){
    //     marks= new int[3];
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
    // }

    // deep_copy constructors :  // change will not be reflected as new obj created.
    Student(Student s1){
        marks = new int[3];
        this.name =s1.name;
        this.age = s1.age;
        for(int i=0 ; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Student(){
        marks = new int[3];
        System.out.println("hello");
    } 
    Student(String name) {     
        marks = new int[3];
        this.name = name; 
    }
    Student(int age) {                                    
        marks = new int[3];
        this.age = age;
    }
}                                                                                                                               