package com.company.core.arrays;

import java.util.Arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {


    /**
     * adds new int "element" at the end of int[] "source"
     *
     * @param source int[] - The initial int[]
     * @param element int - The int that will be added
     * @return int[] with the same elements as "source" + "element" at last index
     *
     * @author Chavdar Tsvetkov && Georgi Benchev
     */
    public static int[] add(int[] source, int element) {
        int[] newArray = new int[source.length + 1];
        for (int i = 0; i <= source.length - 1; i++) {
            newArray[i] = source[i];
        }
        newArray[newArray.length - 1] += element;
        return newArray;
    }


    /**
     * adds new int "element" at the beginning of int[] "source"
     *
     * @param source int[] - The initial int[]
     * @param element int - The int that will be added
     * @return int[] with the same elements as "source" + "element" at index 0
     *
     * @author Georgi Benchev
     */
    public static int[] addFirst(int[] source, int element) {
        int[] newArray = new int[source.length + 1];

        newArray[0] += element;

        for (int i = 0; i <= source.length - 1; i++) {
            newArray[i + 1] = source[i];
        }

        return newArray;
    }


    /**
     * Adds all "elements" to the end of targeted int[] "source"
     *
     * @param source int[] - The initial int[]
     * @param elements int... - The integers that will be added
     * @return int[] with the same elements as "source" + all integers from "elements" at the end
     *
     * @author Georgi Benchev
     */
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


    /**
     * Checks if "source" contains "element" and returns boolean
     *
     * @param source int[] - The array to check
     * @param element int - The integer that will be checked
     * @return boolean - true if the integer "element" is contained in the int[] "source"
     * and false if it's not.
     *
     * @author Georgi Benchev
     */
    public static boolean contains(int[] source, int element) {
        for (int j : source) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }


    /**
     * Makes a copy of int[] "sourceArray"
     * and copies its first elements up to index "count"
     * and puts them in to int[] "destinationArray"
     *
     * @param sourceArray int[] - The array from witch we take the numbers.
     * @param destinationArray int[] - The integer that is updated.
     * @param count int - The size of the new int[] "destinationArray".
     * @return void -> "destinationArray" is updated because int[] is reference type.
     *
     * @author Georgi Benchev
     */
    public static void copy(int[] sourceArray, int[] destinationArray, int count) {
        for (int i = 0; i < Math.min(count, sourceArray.length); i++) {
            destinationArray[i] = sourceArray[i];
        }
    }


    /**
     * Copies "count" elements from int[] "sourceArray" starting at index "sourceStartIndex"
     * in to int[] "destinationArray" at position starting at "destStartIndex"
     *
     * @param sourceArray int[] - The array from witch we take the numbers.
     * @param sourceStartIndex int - The start index for "sourceArray".
     * @param destinationArray int[] - The int[] that is updated.
     * @param destStartIndex int - The start index for the update of "destinationArray".
     * @param count int - The amount of numbers that we copy from "sourceArray".
     * @return void -> destinationArray is updated because int[] is reference type.
     *
     * @author Georgi Benchev
     */
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

    /**
     * Finds the first index of <code>target<code/> within <code>source<code/>.
     *
     * @param source int[] - The array to check in
     * @param target int - The element to check for
     * @return int - The first index of target within source, otherwise, -1
     *
     * @author Lachezar Lazarov
     */
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

    /**
     * Inserts <code>element<code/>> at index <code>index<code/>> in <code>source<code/>>.
     *
     * @param source int[] - The array to insert in
     * @param index int - The index to insert at
     * @param element int - The element to insert
     * @return int[] - A new array with element in it
     *
     * @author Lachezar Lazarov
     */
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

        if (source.length == 0) {
            return -1;
        }

        int lastIndex = 0;
        boolean flag = false;
        for (int i = 0; i <= source.length - 1; i++) {
            if (source[i] == target) {
                lastIndex = i;
                flag = true;
            }

        }

        if (flag){
            return lastIndex;
        }else {
            return -1;
        }

    }

    /**
     * Removes all occurrences of <code>element</code> in array <code>source</code>.
     *
     * @param source  an array[] from which we read its elements
     * @param element  The element which we need to remove
     * @return An array that represents the version of the array source
     * which removes all occurrences of element n in it.
     *
     * @author Ivan Ivanov
     */
    public static int[] removeAllOccurrences(int[] source, int element) {

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

    /**
     * Reverses array <code>arrayToReverse</code> to the same array.
     *
     * @param arrayToReverse as the array that needs to be reversed
     * Reverses the contents of ArrayToRevers by creating a new array in the method and then
     * overwriting the contents of the original array.
     *
     * @author Ivan Ivanov
     **/
    public static void reverse(int[] arrayToReverse) {
        int[] result = new int[arrayToReverse.length];
        for (int i = arrayToReverse.length - 1 , j = 0;  i >= 0 && j < result.length; i--, j++) {
            result[j] = arrayToReverse[i];
        }
        for (int i = 0; i < arrayToReverse.length; i++) {
            arrayToReverse[i] = result[i];
        }
    }



    // Returns a clipped version of the originally given array.
    // If the endIndex is out of bounds, the array will only be clipped from the start.
    // If the startIndex is out of bounds, the array will return the same as given.
    // If there are 0 elements in the array, the same array will be returned.
    // Chavdar Tsvetkov
    public static int[] section(int[] source, int startIndex, int endIndex) {
        if (source.length == 0){
            return source;
        }

        if (endIndex >= source.length || endIndex < 0){

            int count = 0;

            int[] shorterArr = new int[source.length  - startIndex];

            for (int i = 0; i <= shorterArr.length - 1 ; i++) {
                shorterArr[i] += source[startIndex + count];
                count ++;
            }
            return shorterArr;
        }

        if (startIndex < 0 || startIndex >= source.length){
            return source;
        }

        int count = 0;
        int[] newArr = new int[(endIndex - startIndex) + 1];

        for (int i = startIndex; i <= endIndex ; i++) {

            newArr[count] += source[i];

            count++;

        }
        return newArr;

    }
}
