package de.neuefische.lennart.passwordexerciseself;

public class PasswordExerciseSelf {

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
}