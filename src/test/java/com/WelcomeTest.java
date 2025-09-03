import org.junit.Test;
import static org.junit.Assert.*;

public class WelcomeTest {
    @Test
    public void testWelcomeMessage() {
        String message = "Welcome to the Java Web Application!";
        assertEquals("Welcome to the Java Web Application!", message);
    }
}