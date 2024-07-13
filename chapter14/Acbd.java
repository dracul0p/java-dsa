import java.util.Scanner;
public class Abcd {

	public static void main(String[] args) {
	
		// Write your code here
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name  :");
		String name = scanner.nextLine();
		System.out.println("Enter your age : ");
		int age = scanner.nextInt();
		System.out.println("your name is : "  + name);
		System.out.println("your age is : "  + age);
		scanner.close();

	}
}