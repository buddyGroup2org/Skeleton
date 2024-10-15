package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {
    //Daniel
    //Length Check:
    //If the length of source is less than or equal to maxLength, the method simply returns the original string, unchanged.
    //Initializing StringBuilder to keep the String part.
    //A loop that adds the characters in result.
    //If source is longer than maxLength, an ellipsis (...) is added to the end of result.
    //Return the result.
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

    //Daniel
    //Checking if the string is empty.
    //Creating a StringBuilder which copies the contents of the original source string.
    //Iterate through the symbols If it is the first character, it is converted to an uppercase letter
    // using Character.toUpperCase() and replaced in StringBuilder using setCharAt().
    //Return the result.
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

    //Concatenates the two strings string1 and string2.
    //Return the result.
    public static String concat(String string1, String string2) {
        String result = string1 + string2;
        return result;
    }
    //Iterates through each character in the source string.
    //Check if the current element is equal to the symbol.
    //If it is return true, else return false.
    public static boolean contains(String source, char symbol) {
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == symbol){
                return true;
            }
        }
        return false;
    }

    public static boolean endsWith(String source, char target) {
        /**
         * Checks if the given String <code>source</code> ends with the given char <code>target</code>.
         *
         * @param String source - a string from which we read its last element
         * @param char target The target which we need to check if it is the last of char of the string
         * @return A boolean of true or false, whether its the target or not.
         *
         * @author Ivan Ivanov
         */
        if (source.isEmpty()){
            return false;
        }
        if (target == source.charAt(source.length() - 1)){
            return true;
        }
        return false;
    }

    public static int firstIndexOf(String source, char target) {
        /**
         * Searches first appearance of <code>char</code> index in String <code>source</code>
         * and returns its int position.
         *
         * @param String source a string from which we read its elements
         * @param char element - The element which we need to search in the string
         * @return An int of which index is the first appearance of target in the string.
         *
         * @author Ivan Ivanov
         */
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

    //Initialization:
    //A loop that iterates through source in reverse order, starting from the last character.
    //Symbol comparison.
    //Check for character.
    //Return position.
    public static int lastIndexOf(String source, char symbol) {
        boolean isFound = false;
        int position = 0;
        for (int i = source.length() - 1; i >= 0; i--) {
            if (source.charAt(i) == symbol){
                isFound = true;
                position = i;
            }
        }
        if (!isFound){
            position = -1;
        }
        return position;
    }

    public static String pad(String source, int length, char paddingSymbol) {
        /**
         * Pads string on the left and right sides if it's shorter than <code>length</code>.
         *
         * @param source String - The string to pad
         * @param length int - The length of the string to achieve
         * @param target char - The character used as padding
         * @return The padded string
         *
         * @author Lachezar Lazarov
         */
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

    public static String padEnd(String source, int length, char paddingSymbol) {
        /**
         * Pads <code>source</code> on the right side with <code>paddingSymbol</code> enough times to reach length <code>length</code>.
         *
         * @param source String - The string to pad
         * @param length int - The length of the string to achieve
         * @param paddingSymbol char - The character used as padding
         * @return The padded string
         *
         * @author Lachezar Lazarov
         */
        String result = source;
        for (int i = result.length(); i < length; i++) {
            result += paddingSymbol;
        }
        return result;
    }

    public static String padStart(String source, int length, char paddingSymbol) {
        /**
         * Pads <code>source</code> on the left side with <code>paddingSymbol</code> enough times to reach length <code>length</code>.
         *
         * @param source String - The string to pad
         * @param length int - The length of the string to achieve
         * @param paddingSymbol char - The character used as padding
         * @return The padded string
         *
         * @author Lachezar Lazarov
         */
        String result = "";
        for (int i = 0; i < length - source.length(); i++) {
            result += paddingSymbol;
        }
        result += source;
        return result;
    }

    public static String repeat(String source, int times) {
        return null;
    }

    public static String reverse(String source) {
        return null;
    }

    /* returns a subString "section" from input String "source"
     starting at index "start"(inclusive) and ending at index "end"(inclusive)
     Georgi Benchev   */
    public static String section(String source, int start, int end) {
        String section = "";
        for (int i = start; i <= end; i++) {
            section += (source.charAt(i));
        }
        return section;
    }

    // checks if the first char of given string "source" is the same as char "target"
    // Georgi Benchev
    public static boolean startsWith(String source, char target) {
        if (!source.isEmpty() && source.charAt(0) == target) {
            return true;
        }
        return false;
    }

}
