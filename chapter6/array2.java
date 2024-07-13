import java.util.Scanner;
// passing array as arguments  : call by refrence  

public class array2 {
    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i = 0 ; i < marks.length ; i++){              // 0 to last index of array
            marks[i] = marks[i]+ 1;  // add 1 in element of array
          
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int marks[] = { 97, 98, 99};
       
        int nonChangable = 5;
        update(marks , nonChangable );    // marks :call by refrence for array change is reflected in main fn.
        System.out.println(nonChangable);

        // print our marks 
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
         
        for(int i = 0 ; i< marks.length ; i++){ // print marks  / output
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}

        
    
