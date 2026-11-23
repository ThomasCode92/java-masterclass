package dev.t4s;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int number) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values:\r");
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = s.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %s%n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];

        Arrays.sort(array);

        // copy the sorted array into the new array in reverse order
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[array.length - 1 - i];
        }

        return sortedArray;
    }
}
