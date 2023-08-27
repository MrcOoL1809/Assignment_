import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number :- ");
		int a = scanner.nextInt();
		scanner.close();
		System.out.println("Fibonacci Series :- ");
		
		int firstTerm = 0, secondTerm = 1;
		for (int i = 1; i<= a; i++) {
			System.out.println(firstTerm + " ");
			
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

	}

}
