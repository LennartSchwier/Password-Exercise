package de.neuefische.lennart.passwordexerciseself;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordExerciseSelfTest {

    // checkPasswordLength()
    @ParameterizedTest(name = "Lenth of password {0} is true or false {1}")
    @CsvSource({
            "1234567, false",
            "12345678, true",
            "123456789012, true",
            "1234567890123, false"

    })
    void testLengthcorrect(String input, boolean expectedResult) {
        // GIVEN
        // see CsvSource

        // WHEN
        boolean result = PasswordExerciseSelf.checkPasswordLength(input);

        // THEN
        assertEquals(expectedResult, result);
    }

    // checkContainsNumber()
    @ParameterizedTest (name = "Password {0} contains a number true or false {1}")
    @CsvSource({
            "1, true",
            "a, false",
            "1aa, true",
            "a1a, true",
            "aa1, true"
    })
    void testContainsNumber(String input, boolean expectedResult) {
        // GIVEN
        // see CsvSource

        // WHEN
        boolean result = PasswordExerciseSelf.checkContainsNumber(input);

        // THEN
        assertEquals(expectedResult, result);
    }

    // checkLowerCase
    @ParameterizedTest(name = "Password {0} contains a lower case letter {1}")
    @CsvSource({
            "D, false",
            "d, true",
            "aD, true",
            "Da, true",
            "DaD, true"
    })
    void testContainsLowerCase(String input, boolean expectedResult) {
        // GIVEN
        // see CsvSource

        // WHEN
        boolean result = PasswordExerciseSelf.checkLowerCase(input);

        // THEN
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "Password {0} contains an upper case letter {1}")
    @CsvSource({
            "D, true",
            "d, false",
            "Da, true",
            "aD, true",
            "dAd, true"
    })
    void testContainsUpperCase(String input, boolean expectedResult) {
        // GIVEN
        // see CSVSource

        // WHEN
        boolean result = PasswordExerciseSelf.checkUpperCase(input);

        // THEN
        assertEquals(expectedResult, result);
    }
}