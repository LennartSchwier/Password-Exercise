package de.neuefische.lennart.passwordexerciseself;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordExerciseSelfTest {

    @Test
    @DisplayName("Length of password correct")
    void testLengthcorrect() {
        // GIVEN
        String input = "12345678";

        // WHEN
        boolean result = PasswordExerciseSelf.checkPasswordLength(input);

        // THEN
        assertTrue(result);
    }

    @Test
    @DisplayName("Length of password incorrect")
    void testLengthIncorrect() {
        // GIVEN
        String input = "1234567";

        // WHEN
        boolean result = PasswordExerciseSelf.checkPasswordLength(input);

        // THEN
        assertFalse(result);
    }
}