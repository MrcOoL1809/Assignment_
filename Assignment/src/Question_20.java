import java.util.Arrays;

public class Question_20 {

	public static void main(String[] args) {
		int[] numbers =  {10,20,30,40,50};
		int indexToUpdate = 2;
		int newElement = 35;
		
		if (indexToUpdate >= 0 && indexToUpdate < numbers.length) {
			numbers[indexToUpdate] = newElement;
			System.out.println("Array after update :- " +Arrays.toString(numbers));
		}
		else {
			System.out.println("Invalid index");
		}

	}

}
