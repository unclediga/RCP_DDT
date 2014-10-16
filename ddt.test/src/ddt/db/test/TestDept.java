package ddt.db.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.udiga.ddt.model.Dept;

import ddt.db.TestConnect;
import ddt.test.Utils;

public class TestDept {
	
	ArrayList<Dept> testDepts = new ArrayList<Dept>(5);
	
	@Before
	public void init(){

		testDepts.add(new Dept(2, "���2"));
		testDepts.add(new Dept(2, "���"));
		testDepts.add(new Dept(3, "��������������"));
		testDepts.add(new Dept(4, "���������"));
		testDepts.add(new Dept(5, "���������"));
				
	}
		
	
	@Test
	public void getDepts() {
		ArrayList<Dept> depts = new TestConnect().getDepts();
		assertNotNull("list of depts is null",depts);
		assertNotEquals("depts.size() = 0", depts.size(), 0);
		assertTrue("Not equal depts lists", Utils.compareLists(testDepts, depts));
//		fail("Not yet implemented");
	}

}
