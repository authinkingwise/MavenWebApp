package netflixWebApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaseControllerTest {

	@Test
	public void TestWelcome() {
		assertEquals (4,2+2);
	}

	@Test
	public void TestWelcomeName() {
		assertTrue (new String("Test").equals("Test"));
	}	
	
	@Test
	public void TestWelcomeName1() {
		assertNotEquals(new StringBuffer("Test"),new String("Test"));
	}	
}
