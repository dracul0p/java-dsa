import java.util.Scanner;

public class tut2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ;
        System.out.println("enter your name");
        String naam = sc.nextLine();
        String personalised = myGreat(naam);
        System.out.println(personalised);

        String personalised_message = myGreat_name("asheesh");
        System.out.println(personalised_message);
      }
      static String myGreat(String name){
        String message = "hello" + name ;
        return message;
      }

      static String myGreat_name(String name){
        String message = "hello" + name;
        return message;
      
      }
}
