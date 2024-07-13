import java.util.Scanner;

public class stringbuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));

        // set character at index
        sb.setCharAt(0,'a');
        System.out.println(sb);

        // insert character
        sb.insert(0, 'r');
        System.out.println(sb);

        // deleat r
        sb.delete(0, 1);           // end index is no-exclusive.
        System.out.println(sb);
    }
}
