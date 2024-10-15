package com.company.core.arrays;

import java.util.Arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {
    // adds new int to int[] at the end of the original int[]
    // Chavdar Tsvetkov

    public static int[] add(int[] source, int element) {
        int[] newArray = new int[source.length + 1];

        for (int i = 0; i <= source.length - 1; i++) {
            newArray[i] = source[i];
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
            newArray[i + 1] = source[i];
        }

        return newArray;
    }

    // Adds all elements to the end of targeted int[] "source"
    // Georgi Benchev
    public static int[] addAll(int[] source, int... elements) {
        int[] elementsToAdd = Arrays.stream(elements).toArray();
        int[] outputArray = new int[source.length + elementsToAdd.length];

        for (int i = 0; i < source.length; i++) {
            outputArray[i] = source[i];
        }
        for (int newElement = 0; newElement < elementsToAdd.length; newElement++) {
            outputArray[source.length + newElement] = elementsToAdd[newElement];
        }

        return outputArray;
    }

    // Checks if source contains element and returns boolean
    // Georgi Benchev
    public static boolean contains(int[] source, int element) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == element) {
                return true;
            }
        }
        return false;
    }

    // makes copy of int[] "sourceArray" and copies its first "count" elements to int[] "destinationArray"
    // Georgi Benchev
    public static void copy(int[] sourceArray, int[] destinationArray, int count) {
        for (int i = 0; i < Math.min(count, sourceArray.length); i++) {
            destinationArray[i] = sourceArray[i];
        }
    }

    // makes copy of part of int[] "sourceArray" with size "count" elements
    // starting at index "sourceStartIndex" in to int[] "destinationArray" at position starting at "destStartIndex"
    // Georgi Benchev
    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {
        for (int i = destStartIndex; i < count + destStartIndex; i++) {
            destinationArray[i] = sourceArray[i - destStartIndex + sourceStartIndex];
        }


    }

    // fills every int in int[] "source" with int "element"
    // Georgi Benchev
    public static void fill(int[] source, int element) {
        for (int i = 0; i <source.length ; i++) {
            source[i]=element;
        }
    }

    public static int firstIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] insert(int[] source, int index, int element) {return new int[1];
    }


    // Checks if the input index is valid in the array
    // Chavdar Tsvetkov
    public static boolean isValidIndex(int[] source, int index) {

        for (int i = 0; i <= source.length - 1 ; i++) {

            if (source.length == 0){
                return false;
            }

            if (index == source[i]){
                return true;
            }
        }
        return false;
    }

    public static int lastIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] removeAllOccurrences(int[] source, int element) {
        return new int[1];
    }

    public static void reverse(int[] arrayToReverse) {
    }

    public static int[] section(int[] source, int startIndex, int endIndex) {
        return new int[1];
    }

}
