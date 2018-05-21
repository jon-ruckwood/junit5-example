import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import support.LoggingExtension;

@ExtendWith(LoggingExtension.class)
class ExtensionTest {
    @Test
    void lookAtStdOut() {
        System.out.println("The test body...");
    }
}
