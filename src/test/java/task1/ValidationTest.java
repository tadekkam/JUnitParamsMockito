package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    @ParameterizedTest
    @ValueSource(ints = {4,10,88,12,100})
    void isModuloTest(int number) {
        Assertions.assertTrue(Validation.isModulo(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"4:4", "10:1", "22:4", "157:13"}, delimiter = ':')
    void sumOfDigitsTest(int number) {
        int result = Validation.sumOfDigits(number);
        Assertions.assertEquals(Validation.sumOfDigits(number), result);
    }

}