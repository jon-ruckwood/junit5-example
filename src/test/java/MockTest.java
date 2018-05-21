import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MockTest {
    @Mock
    private Messenger m;

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
