package task2;

public class StringConverter {

    public static String convertToUpper(String input) {

        if (input == null || input.isEmpty()) {
            return null;
        }

        return input.toUpperCase();
    }

}
