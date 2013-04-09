package mobOrganiser;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//Test suit to run multiple tests
@RunWith(Suite.class)
@SuiteClasses({ TestAddFunction.class, TestMultFunction.class })
public class AllTests {

}
