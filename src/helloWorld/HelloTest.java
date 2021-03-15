package helloWorld;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * jUnit test to verify String "Hello World!" was returned
 * 
 * @author Mark Elliott
 * @version 1.0
 */

public class HelloTest {

	@Test
	public void testString() {
		String expected = new String ("Hello World!");
		String compare;
		
		compare = Hello.getString();
		assertEquals(expected,compare); 
	}
}
