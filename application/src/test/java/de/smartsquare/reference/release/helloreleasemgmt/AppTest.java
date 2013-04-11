package de.smartsquare.reference.release.helloreleasemgmt;

import de.smartsquare.reference.release.helloreleasemgmtstuff.Stuff;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Dumb test of the Scenario.
     */
    public void testGetScenario() {
        assertEquals(App.getAppScenario(), "We got some quite good feedback on the first RC for iteration 1, changed the code a bit and now release the next RELEASE CANDIDATE.");
    }
    
    /**
     * Ensure that we are getting the correct stuff.
     */
    public void testStuffVersion() {
        Stuff someStuff = new Stuff();
        assertEquals(1, someStuff.getVersion());
    }
}
