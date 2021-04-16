//Vamsi Jangala E19CSE054
package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		int result = junit.addNumber(30, 70);
		assertEquals(100, result);
	}

}
