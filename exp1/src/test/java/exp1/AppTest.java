/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exp1;

import org.junit.Test;
import static org.junit.Assert.*;

import com.jitianyu.exp1.App;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
