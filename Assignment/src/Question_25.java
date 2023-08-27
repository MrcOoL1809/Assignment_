abstract class Parent {
	abstract void message();
}

 class FirstSubclass extends Parent {
	 void message() {
		 System.out.println("This is the first subclass");
	 }
 }
 
 class SecondSubclass extends Parent {
	 void message() {
		 System.out.println("This is the second subclass");
	 }
 }
public class Question_25 {

	public static void main(String[] args) {
		Parent subclass1 = new FirstSubclass();
		Parent subclass2 = new SecondSubclass();
		
		subclass1.message();
		subclass2.message();

	}

}
