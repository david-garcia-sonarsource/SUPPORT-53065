import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testMain() {
        // You can capture the output of the main method and assert against expected output
        // For simplicity, we'll just assert that the method runs without exceptions
        HelloWorld.main(null);
    }
}
