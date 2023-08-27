
public class Question_07 {
	public static void main(String[] args) {


		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
///////////////////////////////////////////////////////////
		int k = 5;
		int l = k/2;
		int stars =1;
		
		for (int i=1; i<=k; i++) {
			for(int j=1; j<=l; j++) {
				System.out.print("");
			}
			for (int j=1; j <=stars; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if (i <=k /2) {
				l--;
				stars+= 2;
			}
			else {
				l--;
				stars -=2;
			}
		}
	}
}

