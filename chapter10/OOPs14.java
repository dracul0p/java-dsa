// Static keyword :

public class OOPs14 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "KVI";
        System.out.println(s1.schoolName); // KVI

        Student s2 = new Student();
        System.out.println(s2.schoolName); //KVI  /  as schoolName is of static variabl  .
        Student s3 = new Student();
        System.out.println(s3.schoolName); //KVI  /  as schoolName is of static class / always same value.
        Student s4 = new Student();

        s4.schoolName = "ima";
        System.out.println(s1.schoolName);

    }
    
}
class Student{
    static int returnPercentage(int math , int phy ,int chem){
        return (math + phy + chem)/3;

    }  

    String name;
    int roll;
    
    static String schoolName; // static variable.
    
    void setname(String name){
        this.name = name;

    }
    String getname(){
        return this.name;

    }
}
