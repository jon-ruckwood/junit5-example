import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyFirstTest {
    @Test
    void myFirstTest() {
        assertThat(1 + 1).isEqualTo(2);
    }
}
