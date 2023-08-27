
public class Question_12 {
	public static void main(String[] args) {
		int[] a = { 5,26,66,46,70,40};
		
		int max = a[0];
		int min = a[0];
		
		for (int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Maximum value:- " +max);
		System.out.println("Minimum value :- " +min);	
    }
}
