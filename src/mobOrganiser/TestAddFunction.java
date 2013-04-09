package mobOrganiser;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class TestAddFunction extends TestCase{

	@Test
	public void test() {
		DemoClass tester = new DemoClass();
		assertEquals(15, tester.add(10, 5));
	}

}
