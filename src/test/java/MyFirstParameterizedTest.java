import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MyFirstParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"cat", "dog", "rabbit", "fish"})
    void myContrivedTest(String value) {
        assertThat(value.length()).isLessThanOrEqualTo(6);
    }

    @ParameterizedTest(name = "{0}''s name contains {1} characters")
    @MethodSource("parameters")
    void anotherContrivedTest(String name, int length) {
        assertThat(name.length()).isEqualTo(length);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Bob", 3),
                Arguments.of("Kate", 4),
                Arguments.of("Frank", 5));
    }
}
