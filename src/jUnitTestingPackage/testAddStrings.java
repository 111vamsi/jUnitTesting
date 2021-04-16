//Vamsi Jangala E19CSE054
package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitStrings = new jUnitFunction();
		String result = junitStrings.addStrings("You must be the change"," you wish to see in the world");
		assertEquals("You must be the change you wish to see in the world", result);
	}

}
