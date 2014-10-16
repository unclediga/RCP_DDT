package ddt.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void testCompareLists() {
		ArrayList<Integer> l1 = new ArrayList<Integer>(6);
		ArrayList<Integer> l2 = new ArrayList<Integer>(5);
		for (int i = 0; i < 5; i++) {
			l1.add(i);
			l2.add(i);
		}
		
		assertTrue("Same List is not equals", Utils.compareLists(l1, l2));
		l1.add(10);
		assertFalse("Not Same List is equals", Utils.compareLists(l1, l2));
		
//		fail("Not yet implemented");
	}

}
