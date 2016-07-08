import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitPlatform.class) // <- required temporarily for IDE integration
public class MyFirstTest {
    @Test // note: use the right annotation as we have JUnit 4 on the classpath
    void myFirstTest() {
        assertThat(1 + 1).isEqualTo(2);
    }
}
