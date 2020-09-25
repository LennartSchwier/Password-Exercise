package de.neuefische.lennart.passwordexerciseself;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordExerciseSelf {

    public static final String LENGTH = "Error. Password must be between 8 and 12 characters long.";
    public static final String NO_NUMBER = "Error. Password must contain at least one number.";
    public static final String NO_LOWER_CASE = "Error. Password must contain at least one lower case character.";
    public static final String NO_UPPER_CASE = "Error. Password must contain at least one upper case character.";
    public static final String SPECIAL_CHARACTER = "Error. Only characters a-z and A-Z and 0-9 are allowed.";
    public static final String CHECK_PASSED = "The password is fine.";

    public static void main(String[] args) {

    }

    // checks a password for the rules
    public static String checkPassword(String password) {
        if (!checkPasswordLength(password)) {
            return LENGTH;
        }
        if (!checkContainsNumber(password)) {
            return NO_NUMBER;
        }
        if (!checkLowerCase(password)) {
            return NO_LOWER_CASE;
        }
        if (!checkUpperCase(password)) {
            return NO_UPPER_CASE;
        }
        if (!checkSpecialCharacter(password)) {
            return SPECIAL_CHARACTER;
        }
        return CHECK_PASSED;
    }



    // checks length of password
    public static boolean checkPasswordLength(String password) {
        return password.length() >= 8 && password.length() <= 12;
    }

    // checks for number
    public static boolean checkContainsNumber(String password) {
        return password.matches(".*\\d.*");
    }

    // checks for lower case
    public static boolean checkLowerCase(String password) {
        return password.matches(".*\\p{Lower}.*");
    }

    // checks for upper case
    public static boolean checkUpperCase(String password) {
        return password.matches(".*\\p{Upper}.*");
    }

    // checks for special character
    public static boolean checkSpecialCharacter(String password) {
        Pattern patternCheck = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcherCheck = patternCheck.matcher(password);
        return matcherCheck.matches();
    }
}