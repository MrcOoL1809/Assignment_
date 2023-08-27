import java.util.Scanner;

public class Question_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st String :- ");
		String str1 = scanner.nextLine();
		
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("Enter the 2nd string :- ");
		String str2 = scanner.nextLine();
		
		
		if(str1.compareTo(str2)==0) {
			System.out.println("Yes, The strings are same");
		}
		else {
			System.out.println("The strings are not same");
		}
	}

}
