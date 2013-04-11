package de.smartsquare.reference.release.helloreleasemgmtstuff;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Stuff.
 */
public class StuffTest
        extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StuffTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(StuffTest.class);
    }

    /**
     * Does Stuff has the right version?
     */
    public void testApp() {
        Stuff someStuff = new Stuff();
        assertEquals(1, someStuff.getVersion());
    }
}
