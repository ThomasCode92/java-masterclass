package dev.t4s;

import java.util.Scanner;

public class MinFinder {

    private static int readInteger() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        return s.nextInt();
    }

    private static int[] readElements(int length) {
        Scanner s = new Scanner(System.in);
        int[] values = new int[length];

        System.out.println("Enter " + length + " integer values: ");
        for (int i = 0; i < length; i++) {
            values[i] = s.nextInt();
        }

        return values;
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for (int el : array) {
            if (el < min) min = el;
        }

        return min;
    }
}