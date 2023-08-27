
public class Question_10 {

	public static void main(String[] args) {
		int[] a = { 10,20,30,40,50,60};
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		int average = sum / a.length;
		System.out.println("Average of the array elements is:- "+average);

	}

}
