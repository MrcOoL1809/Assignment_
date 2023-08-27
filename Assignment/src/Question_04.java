import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number :- ");
		int i = scanner.nextInt();
		scanner.close();
		boolean isprime = true;
		
		if (i <= 1) {
			isprime = false;
		}
		else {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j ==0) {
					isprime = false;
					break;
				}
			}
		}
		
		if (isprime) {
			System.out.println(i + " Is a prime number.");
		}
		else {
			System.out.println(i + " Is not a prime number");
		}

	}

}
