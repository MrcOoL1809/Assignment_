import java.util.Arrays;

public class Question_22 {

	public static void main(String[] args) {
		int[] sourceArray = {10,20,25,30,45,50};
		int[] destinationArray = new int[sourceArray.length];
		
		for (int i = 0; i< sourceArray.length; i++) {
			destinationArray[i] = sourceArray[i];
		}
		System.out.println("Source Array :- " + Arrays.toString(sourceArray));
		System.out.println("Destination Array :- " + Arrays.toString(destinationArray));

	}

}
