import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import support.LoggingExtension;

@RunWith(JUnitPlatform.class)
@ExtendWith(LoggingExtension.class)
public class ExtensionTest {
    @Test
    void lookAtStdOut() {
        System.out.println("The test body...");
    }
}
