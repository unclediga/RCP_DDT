package ddt.db.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ddt.test.UtilsTest;

@RunWith(Suite.class)
@SuiteClasses({ TestDept.class, TestPerson.class, UtilsTest.class })
public class AllTests {

}
