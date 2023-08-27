
public class Question_08 {

	public static void main(String[] args) {
		int count =0;
		int number=2;
		int sum=0;
		
		while (count < 100) {
			if (isPrime (number)) {
				sum += number;
				count++;
			}
			number++;
		}
		System.out.println("Sum of the first 100 prime number is:- " + sum);
		}
	public static boolean isPrime(int num) {
		if (num <=1) {
			return false;
		}
		for (int i =2; i <= Math.sqrt(num); i++) {
			if (num%1==0) {
				return false;
			}
		}
		return true;
	}
}
