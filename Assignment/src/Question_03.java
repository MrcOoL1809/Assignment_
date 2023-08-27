import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number :- ");
		int a = scanner.nextInt();
		scanner.close();
		
		int factorial = 1;
		for (int i = 1; i <= a; i++) {
			factorial *= i;
		}
		System.out.println("Factorial of " + a + " Is :- " +factorial);
	}
}
