/* Aggregate all test cases from multiple classes in one place and run it together.
 * To run the suite test, you need to annotate a class using below-mentioned annotations:
 * @Runwith(Suite.class)
 * @SuiteClasses(list test classes seperated by comma
 */
package test;
import nmchallenge.*;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestDeckOfCards.class,
					TestCard.class,
                    })

public class TestSuite {

}