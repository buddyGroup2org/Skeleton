package com.company.core.arrays;

import java.util.Arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {
    // adds new int to int[] at the end of the original int[]
    // Chavdar Tsvetkov
    public static int[] add(int[] source, int element) {
        int[] newArray = new int[source.length + 1];

        for (int i = 0; i <= source.length - 1; i++) {
            newArray[i] += source[i];
        }

        newArray[newArray.length - 1] += element;

        return newArray;

    }

    // adds new int to int[] at index 0 while preserving the rest of the original int[]
    // Georgi Benchev
    public static int[] addFirst(int[] source, int element) {
        int[] newArray = new int[source.length + 1];

        newArray[0] += element;

        for (int i = 0; i <= source.length - 1; i++) {
            newArray[i + 1] += source[i];
        }

        return newArray;
    }

    public static int[] addAll(int[] source, int... elements) {
        int[] elementsToAdd = Arrays.stream(elements).toArray();
        int[] outputArray = new int[source.length + elementsToAdd.length];

        for (int i = 0; i < source.length; i++) {
            outputArray[i] += source[i];
        }
        for (int newElement = 0; newElement < elementsToAdd.length; newElement++) {
            outputArray[source.length+newElement]=elementsToAdd[newElement];
        }

        return outputArray;
    }

    public static boolean contains(int[] source, int element) {
        return false;
    }

    public static void copy(int[] sourceArray, int[] destinationArray, int count) {

    }

    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {

    }

    public static void fill(int[] source, int element) {

    }

    public static int firstIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] insert(int[] source, int index, int element) {
        return new int[1];
    }

    public static boolean isValidIndex(int[] source, int index) {
        return false;
    }

    public static int lastIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] removeAllOccurrences(int[] source, int element) {
        //Ivan Ivanov
        int count = 0;
        for (int i = 0; i < source.length; i++) {
            if (source[i] == element) {
                count++;
            }
        }
        int[] result = new int[source.length - count];
        int index = 0;
        for (int i = 0; i < source.length; i++) {
            if (source[i] != element) {
                result[index++] = source[i];
            }
        }
        return result;
    }

    public static void reverse(int[] arrayToReverse) {
    }

    public static int[] section(int[] source, int startIndex, int endIndex) {
        return new int[1];
    }

}
