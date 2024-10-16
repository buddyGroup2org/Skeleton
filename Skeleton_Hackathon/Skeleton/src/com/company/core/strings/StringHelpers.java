package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {


    /**
     * Abbreviates a "source" using ellipses.
     *
     * @param source String that will be used.
     * @param maxLength int that will be the max length of the new string.
     * @return String - The abbreviated String.
     *
     * @author Daniel Kolev
     */
    public static String abbreviate(String source, int maxLength) {
        if (source.length() <= maxLength) {
            return source;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            result.append(source.charAt(i));
        }
        if (source.length() > maxLength) {
            result.append("...");
        }
        return result.toString();
    }


    /**
     * Capitalizes a string changing the first character to upper case.
     * No other characters are changed. If source is empty returns empty string.
     *
     * @param source String that will be updated.
     * @return String - The capitalized string or empty string if "source" is empty.
     *
     * @author Daniel Kolev
     */
    public static String capitalize(String source) {

        if (source.length() == 0) {
            return source;
        }
        StringBuilder result = new StringBuilder(source);
        for (int i = 0; i < result.length(); i++) {
            if (i == 0) {
                result.setCharAt(i, Character.toUpperCase(result.charAt(i)));
            }

        }
        return result.toString();
    }


    /**
     * Concatenates the two strings "string1" and "string2".
     *
     * @param string1 The first string that will be used.
     * @param string2 The second string that will be used.
     * @return String that represents the concatenation of string1 followed by string2's characters.
     *
     * @author Daniel Kolev
     */
    public static String concat(String string1, String string2) {
        String result = string1 + string2;
        return result;
    }


    /**
     * Check for character "symbol" in string "source"
     *
     * @param source The string that will be used.
     * @param symbol The char that will be located.
     * @return boolean If "source" contains "symbol" return true, else return false.
     *
     * @author Daniel Kolev
     */
    public static boolean contains(String source, char symbol) {
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == symbol) {
                return true;
            }
        }
        return false;
    }


    /**
     * Checks if the given String <code>source</code> ends with the given char <code>target</code>.
     *
     * @param source - a string from which we read its last element
     * @param target - The target which we need to check if it is the last of char of the string
     * @return A boolean of true or false, whether its the target or not.
     * @author Ivan Ivanov
     */
    public static boolean endsWith(String source, char target) {
        if (source.isEmpty()) {
            return false;
        }
        if (target == source.charAt(source.length() - 1)) {
            return true;
        }
        return false;
    }


    /**
     * Searches first appearance of <code>char</code> index in String <code>source</code>
     * and returns its int position.
     *
     * @param source a string from which we read its elements
     * @param target char element - The element which we need to search in the string
     * @return An int of which index is the first appearance of target in the string.
     * @author Ivan Ivanov
     */
    public static int firstIndexOf(String source, char target) {
        boolean isFound = false;
        int position = 0;
        for (int i = 0; i < source.length(); i++) {
            if (target == source.charAt(i)) {
                isFound = true;
                position = i;
            }
        }
        if (isFound) {
            return position;
        }
        return -1;
    }


    /**
     * Check for character "symbol" in string "source"
     *
     * @param source The string that will be used.
     * @param symbol The char that will be located.
     * @return int - The last position of "symbol" in string "source".
     *
     * @author Daniel Kolev
     */
    public static int lastIndexOf(String source, char symbol) {
        boolean isFound = false;
        int position = 0;
        for (int i = source.length() - 1; i >= 0; i--) {
            if (source.charAt(i) == symbol) {
                isFound = true;
                position = i;
            }
        }
        if (!isFound) {
            position = -1;
        }
        return position;
    }


    /**
     * Pads string on the left and right sides if it's shorter than <code>length</code>.
     *
     * @param source        String - The string to pad
     * @param length        int - The length of the string to achieve
     * @param paddingSymbol char - The character used as padding
     * @return The padded string
     * @author Lachezar Lazarov
     */
    public static String pad(String source, int length, char paddingSymbol) {

        int index = 0;
        String result = "";
        int difference = length - source.length();
        if (source.length() > length) {
            return source;
        }
        while (index < difference / 2) {
            result += paddingSymbol;
            index++;
        }
        index = 0;
        result += source;
        while (index < difference / 2) {
            result += paddingSymbol;
            index++;
        }
        return result;
    }


    /**
     * Pads <code>source</code> on the right side with <code>paddingSymbol</code> enough times to reach length <code>length</code>.
     *
     * @param source        String - The string to pad
     * @param length        int - The length of the string to achieve
     * @param paddingSymbol char - The character used as padding
     * @return The padded string
     * @author Lachezar Lazarov
     */
    public static String padEnd(String source, int length, char paddingSymbol) {
        String result = source;
        for (int i = result.length(); i < length; i++) {
            result += paddingSymbol;
        }
        return result;
    }


    /**
     * Pads <code>source</code> on the left side with <code>paddingSymbol</code> enough times to reach length <code>length</code>.
     *
     * @param source        String - The string to pad
     * @param length        int - The length of the string to achieve
     * @param paddingSymbol char - The character used as padding
     * @return The padded string
     * @author Lachezar Lazarov
     */
    public static String padStart(String source, int length, char paddingSymbol) {
        String result = "";
        for (int i = 0; i < length - source.length(); i++) {
            result += paddingSymbol;
        }
        result += source;
        return result;
    }


    /**
     * Repeats the given "source" "times" times
     *
     * @param source The string that will be repeated.
     * @param times the number of repetitions.
     * @return String - returns the "source" repeated "times" times and saved in a new String.
     *
     * @author Daniel Kolev
     */
    public static String repeat(String source, int times) {
        String repeatingWord = "";
        if (times == 0) {
            repeatingWord = source;
            return repeatingWord;
        }
        for (int i = 0; i < times; i++) {
            repeatingWord += source;
        }
        return repeatingWord;
    }


    /**
     * Reverses the elements of string "source"
     *
     * @param source The string that will be reversed.
     * @return the reversed result of string "source".
     * @author Ivan Ivanov
     */
    public static String reverse(String source) {
        char[] reversedSource = new char[source.length()];
        for (int i = source.length() - 1, j = 0; i >= 0 && j < source.length(); i--, j++) {
            reversedSource[i] = source.charAt(j);
        }
        String result = "";
        for (int i = 0; i < reversedSource.length; i++) {
            result = result + reversedSource[i];
        }
        return result;
    }


    /**
     * returns a subString "section" from input String "source"
     * starting at index "start"(inclusive) and ending at index "end"(inclusive)
     *
     * @param source The string that will be cut.
     * @param start  The start(inclusive) of the new string.
     * @param end    The end(inclusive) of the new string.
     * @return the result in string "section".
     * @author Georgi Benchev
     */
    public static String section(String source, int start, int end) {
        String section = "";
        for (int i = start; i <= end; i++) {
            section += (source.charAt(i));
        }
        return section;
    }


    /**
     * checks if string "source" starts with char "target"
     *
     * @param source The string that will be checked.
     * @param target The char that will be used for the check
     * @return A boolean - true if "source" starts with "target" and false if not
     * @author Georgi Benchev
     */
    public static boolean startsWith(String source, char target) {
        if (!source.isEmpty() && source.charAt(0) == target) {
            return true;
        } else {
            return false;
        }
    }

}
