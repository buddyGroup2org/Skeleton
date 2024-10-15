package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    public static String abbreviate(String source, int maxLength) {
        //Daniel
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

    public static String capitalize(String source) {
        //Daniel
        //Checking if the string is empty.
        //Creating a StringBuilder which copies the contents of the original source string.
        //Iterate through the symbols If it is the first character, it is converted to an uppercase letter
        // using Character.toUpperCase() and replaced in StringBuilder using setCharAt().
        //Return the result.
        if (source.length() == 0){
            return source;
        }
        StringBuilder result = new StringBuilder(source);
        for (int i = 0; i < result.length(); i++) {
            if (i == 0){
                result.setCharAt(i, Character.toUpperCase(result.charAt(i)));
            }

        }
        return result.toString();
    }

    public static String concat(String string1, String string2) {
        return null;
    }

    public static boolean contains(String source, char symbol) {
        return false;
    }

    public static boolean endsWith(String source, char target) {
        return false;
    }

    public static int firstIndexOf(String source, char target) {
        return 0;
    }

    public static int lastIndexOf(String source, char symbol) {
        return 0;
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
        if(source.length() > length){
            return source;
        }
        while(index < difference/ 2){
            result += paddingSymbol;
            index++;
        }
        index = 0;
        result += source;
        while(index < difference / 2){
            result += paddingSymbol;
            index++;
        }
        return  result;
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
            result+= paddingSymbol;
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

    public static String section(String source, int start, int end) {
        return null;
    }

    // checks if the first char of given string "source" is the same as char "target"
    // Georgi Benchev
    public static boolean startsWith(String source, char target) {
        if (!source.isEmpty() &&source.charAt(0) == target) {
            return true;
        }
        return false;
    }

}
