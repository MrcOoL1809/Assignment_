import java.util.ArrayList;

public class Question_21 {

	public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<>();
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);
	numbers.add(40);
	numbers.add(50);
	numbers.add(60);
	
	int indexToRemove = 2;
	
	if (indexToRemove >= 0 && indexToRemove < numbers.size()) {
		numbers.remove(indexToRemove);
		System.out.println(" Array List After Removel :-  " +numbers);
		}
	else {
		System.out.println("Invalid index.");
	}
	}

}
