
import org.junit.Test;

import static org.testng.Assert.assertEquals;


public class GreeterTest {

    @Test
    public void testThatGreeterReturnsTheCorrectGreeting() {
        assertEquals("Hello, World!", new Greeter().getGreeting());
    }

}
