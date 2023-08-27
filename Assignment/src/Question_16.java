import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_16 {
		public static void main(String[] args) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter a = ");
				int a = sc.nextInt();
				System.out.println("enter b = ");
				int b = sc.nextInt();
				int c = a / b;
				System.out.println(c);
			}
			catch (ArithmeticException e) {
				System.out.println("number cannot divide by zero");
			} catch (InputMismatchException e) {
				System.out.println("denominator should be numeric");
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("this will executes every time");
			}
     }
}
