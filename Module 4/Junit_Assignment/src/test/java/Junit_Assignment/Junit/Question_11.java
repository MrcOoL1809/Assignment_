package Junit_Assignment.Junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Question_11 {
	@Test
	public void test() {

		String str1 = "Junit";
		String str2 = "Junit";
		String str3 = "test";
		String str4 = "test";
		String str5 = null;
		int i = 23;
		int j = 20;
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3, 4 };

        assertEquals(23, 20);
		assertEquals(123456, 123456);

      assertEquals(str1,str2);
		 assertEquals(str1,str3);

		 assertSame(str3, str4);
		 assertSame(str4, str1);

      assertNotSame(str1, str3);					
      assertNotSame(str1, str2);	
      
      assertNotNull(str1);			
      assertNotNull(str5);
      
      assertNull(str5);			
      assertNull(str2);
      
      assertTrue(i>j);					
      assertTrue(i<j);
      
		assertArrayEquals(a, b);
	}

}
