package de.neuefische.lennart.passwordexerciseself;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordExerciseSelfTest {

    // checkPasswordLength()
    @ParameterizedTest(name = "Length of password {0} is true or false {1}")
    @CsvSource({
            "1234567, false",
            "12345678, true",
            "123456789012, true",
            "1234567890123, false"

    })
    void testLengthCorrect(String input, boolean expectedResult) {
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

    // checkUpperCase
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

    // checkSpecialCharacter
    @ParameterizedTest(name = "Password {0} contains no special character {1}")
    @CsvSource({
            "a, true",
            "!, false",
            "!a, false",
            "a!, false",
            "a!a, false"
    })
    void testContainsNoSpecialCharacter(String input, boolean expectedResult) {
        // GIVEN
        // see CsvSource

        // WHEN
        boolean result = PasswordExerciseSelf.checkSpecialCharacter(input);

        // THEN
        assertEquals(expectedResult, result);
    }

    // checkPassword
    @ParameterizedTest(name = "Password {0} is {1}")
    @CsvSource({
            "1234567, Error. Password must be between 8 and 12 characters long.",
            "abcdefgh, Error. Password must contain at least one number.",
            "1234567A, Error. Password must contain at least one lower case character.",
            "1234567a, Error. Password must contain at least one upper case character.",
            "12345678Aa!, Error. Only characters a-z and A-Z and 0-9 are allowed.",
            "12345678Aa, The password is fine."
    })
    void testPassword(String input, String expectedResult) {
        // GIVEN
        // see CsvSource

        // WHEN
        String result = PasswordExerciseSelf.checkPassword(input);

        // THEN
        assertEquals(expectedResult, result);
    }
}