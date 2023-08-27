
public class question_11 {

	public static void main(String[] args) {
		int[] a = { 10,20,30,40,50,60};
		int j = 40;
		
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == j ) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			System.out.println("Element " + j + " found at index :- " + index);
		}
		else {
		System.out.println("Element "  + j + " is not found in the array.");
	}
  }
}
