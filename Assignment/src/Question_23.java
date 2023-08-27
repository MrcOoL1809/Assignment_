import java.util.Arrays;

public class Question_23 {

	public static void main(String[] args) {
		int[] numbers = {10,15,20,25,30};
		reverseArray(numbers);
		
		System.out.println("Original Array :- "+ Arrays.toString(numbers));


	}

	public static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length -1;
		
		while (start < end ) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println("Reversed Array :- "+ Arrays.toString(arr));
	}
}
