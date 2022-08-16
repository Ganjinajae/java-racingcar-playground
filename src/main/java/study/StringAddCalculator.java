package study;

import study.exceptions.HasNegativeValueException;
import study.exceptions.HasNotNumberValueException;
import study.exceptions.InappropriateFormatException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String input) {
        if (isNullOrNothing(input)) {
            return 0;
        }
        int sum = 0;
        String[] strings = getSplitStrings(input);
        validateStrings(strings);
        sum = calculate(strings);
        return sum;
    }

    private static void validateStrings(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            validateString(strings[i]);
        }
    }

    private static void validateString(String string) {
        String notNumberStrings = string.replaceAll("[0-9]", "");
        if (notNumberStrings.length() > 0) {
            throw new HasNotNumberValueException();
        }

        if (Integer.valueOf(string) < 0) {
            throw new HasNegativeValueException();
        }
    }

    private static int calculate(String[] strings) {
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            sum += Integer.valueOf(strings[i]);
        }
        return sum;
    }

    private static String[] getSplitStrings(String input) {
        if (hasCustomDelimiter(input)) {
            return getCustomStrings(input);
        }
        return input.split(",|:");
    }

    private static String[] getCustomStrings(String input) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).split(customDelimiter);
        }
        throw new InappropriateFormatException();
    }

    private static boolean hasCustomDelimiter(String input) {
        return input.contains("//") && input.contains("\n");
    }

    private static boolean isNullOrNothing(String input) {
        return input == null || input.length() == 0;
    }
}
