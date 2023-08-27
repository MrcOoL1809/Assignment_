
public class Question_24 {

	public static void main(String[] args) {
                int[] numbers = {10,13,15,20,25,30,35,40,45,50,56,60};
                int secondLargest = findSecondLargest (numbers);
                
                if (secondLargest != Integer.MIN_VALUE) {
                	System.out.println("Second largest Element :- "+ secondLargest);
                }
                else {
                	System.out.println("Array doesn't have a second largest element.");
                }
            }
	public static int findSecondLargest (int[] arr) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if (num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			}
			else if (num > secondLargest && num != firstLargest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}

}
