package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    public static String abbreviate(String source, int maxLength) {
        //Daniel
        if (source.length() <= maxLength){
            return source;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            result.append(source.charAt(i));
        }
        if (source.length() > maxLength){
            result.append("...");
        }
        return result.toString();
    }

    public static String capitalize(String source) {
        return null;
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
        String result = source;
        for (int i = result.length(); i < length; i++) {
            result+= paddingSymbol;
        }
        return result;
    }

    public static String padStart(String source, int length, char paddingSymbol) {
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

    public static boolean startsWith(String source, char target) {
        return false;
    }

}
