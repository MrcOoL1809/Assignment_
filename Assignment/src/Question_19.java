import java.util.ArrayList;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

public class Question_19 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Prerak");
		names.add("Vivek");
		names.add("Mahin");
		names.add("Pratham");

		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}		

	}

}
