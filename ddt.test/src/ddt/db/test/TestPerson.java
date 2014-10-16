package ddt.db.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.udiga.ddt.model.Person;

import ddt.db.TestConnect;
import ddt.test.Utils;

public class TestPerson {
	
	ArrayList<Person> testPersons = new ArrayList<Person>(5);
	
	@Before
	public void init(){

		testPersons.add(new Person(1, "������", "����", "��������"));
		testPersons.add(new Person(2, "������", "����", "��������"));
		testPersons.add(new Person(3, "�������", "�����", "���������"));
		testPersons.add(new Person(4, "������", "������", "��������"));
		testPersons.add(new Person(5, "�������", "������", "���������"));
				
	}
		
	
	@Test
	public void getPersons() {
		ArrayList<Person> persons = new TestConnect().getPersons();
		assertTrue("No Persons", Utils.compareLists(testPersons, persons));
//		fail("Not yet implemented");
	}

}
