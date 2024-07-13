public class loop16 {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for(int line =1; line<=n;line++){
            for(int j=1; j<=line;j++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();

        }
    }
}
