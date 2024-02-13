package task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static task2.StringConverter.*;

class StringConverterTest {

    @ParameterizedTest
    @ValueSource(strings = {"string", "CoNvERter", "TeSt", "789321", "!@#$%/\\"})
    void testTransformToUpperCase(String input) {
        String expected = input.toUpperCase();
        String result = convertToUpper(input);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testTransformToUpperCaseWithNullAndEmpty(String input) {
        assertNull(convertToUpper(input));
    }

}







