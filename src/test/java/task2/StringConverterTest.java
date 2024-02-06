package task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
class StringConverterTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"string", "CoNvERter", "TeSt", "789321", "!@#$%/\\"})
    void convertToUpperTest(String input) {
        String expected = input.toUpperCase();
        String result = StringConverter.convertToUpper(input);
        assertEquals(expected, result);
    }

    @Test
    void convertToUpperTestNull() {
        assertNull(StringConverter.convertToUpper(null));
    }

}