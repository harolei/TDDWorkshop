/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package online.study;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void testSubstring() {
        assertNull(null);
        assertNotNull("abcd".substring(1));
        assertFalse("abcd".toLowerCase().endsWith("q"));
        assertTrue("abcd".toUpperCase().startsWith("A"));
        assertEquals("abcd".toUpperCase(), "ABCD");
        assertThat("abcd".substring(1, 2), is("b"));
    }
}
