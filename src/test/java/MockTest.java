import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import support.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitPlatform.class) // <- required temporarily for IDE integration
@ExtendWith(MockitoExtension.class)
public class MockTest {
    @Mock
    private Messenger m;

    // note: you can't seem to run this on it's own within an IDE - a limitation of JUnitPlatform?
    @Test
    void mockTest() {
        // given
        BDDMockito.given(m.getMessage()).willReturn("hello world");

        // then
        assertThat(m.getMessage()).isEqualTo("hello world");
    }

    interface Messenger {
        String getMessage();
    }
}
