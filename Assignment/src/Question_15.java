import java.util.InputMismatchException;
public class Question_15 {

	public static void main(String[] args) {
		try {
			int[]a= {5,7,9,5,3,99};
			System.out.println("Array elements at index 5:- "+a[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("An ArrayIndexOutOfBoundsException Occurred.");
		} 
		System.out.println("Programm continues after the catch block.");
	}
}