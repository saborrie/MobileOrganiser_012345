package mobOrganiser;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultFunction {

	@Test
	public void test() {
		DemoClass tester = new DemoClass();
		assertEquals(50, tester.multiply(10, 5));
	}

}
