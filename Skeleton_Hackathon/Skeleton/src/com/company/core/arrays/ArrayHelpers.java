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
        int result = -1;
        for (int i = 0; i < source.length; i++) {
            if(source[i] == target){
                result = i;
                break;
            }
        }
        return result;
    }

    public static int[] insert(int[] source, int index, int element) {return new int[1];
    public static int[] insert(int[] source, int index, int element) {
        int[] result = new int[source.length + 1];
        result[index] = element;
        int sourceIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if(i == index){
                continue;
            }
            result[i] = source[sourceIndex];
            sourceIndex++;
        }
        return result;
    }


    // Checks if the input index is valid in the array
    // If the array is empty, result should be "false"
    // Chavdar Tsvetkov
    public static boolean isValidIndex(int[] source, int index) {
        if (source.length == 0){
            return false;
        }
        for (int i = 0; i <= source.length - 1 ; i++) {

            if (index == source[i]){
                return true;
            }
        }
        return false;
    }



    // Returns the last index of the array
    // If the array is empty, result should be -1
    // If the target is out of bounds, result should be -1
    // Chavdar Tsvetkov

    public static int lastIndexOf(int[] source, int target) {

            if (source.length == 0){
                return -1;
            }

        for (int i = 0; i <= source.length - 1 ; i++) {

            if (source.length - 1 == target){
                return source[source.length - 1];
            }
        }
        return -1;
    }

    public static int[] removeAllOccurrences(int[] source, int element) {
        /**
         * Removes all occurrences of <code>element</code> in array <code>source</code>.
         *
         * @param int[] source an array from which we read its elements
         * @param int element The element which we need to remove
         * @return An array that represents the version of the array source
         * which removes all occurrences of element n in it.
         *
         * @author Ivan Ivanov
         */
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
        if (startIndex < 0 || endIndex > source.length || startIndex > endIndex) {
            return source;
        }
        int[] result = new int[endIndex - startIndex];
        for (int i = startIndex; i < endIndex; i++) {
            result[i - startIndex] = source[i];
        }
        return result;
    }
}
