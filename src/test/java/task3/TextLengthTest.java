package task3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
class TextLengthTest {

    static Stream<String> provideTextLength() {
        return Stream.of(
                "",
                "Hello",
                "Lorem ipsum."
        );
    }

    @ParameterizedTest
    @MethodSource("provideTextLength")
    public void testTextLength(String text) {
        int expectedLength = text.length();
        int actualLength = TextLength.getTextLength(text);
        assertEquals(expectedLength, actualLength);
    }
}