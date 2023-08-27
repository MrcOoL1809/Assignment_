import java.util.Scanner;

public class Question_01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the value of 1 = ");
		int i = sc.nextInt();
		System.out.println(" Enter the value of 2 = ");
		int j = sc.nextInt();
		System.out.println("Enter the value of 3 = ");
		int k= sc.nextInt();
		int greatestNumber = Math.max(i, Math.max(j, k));
		System.out.println("The Greatest Number Is :- " +greatestNumber);
	}
}
