package dev.t4s;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] inputArray = readIntegers();
        System.out.println(Arrays.toString(inputArray));

        int min = findMin(inputArray);
        System.out.println("The minimum value is: " + min);
    }

    private static int[] readIntegers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a comma separated list of integers: ");
        String input = s.nextLine();

        String[] stringArray = input.split(",");
        int[] values = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            values[i] = Integer.parseInt(stringArray[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i : array) {
            if (i < min) min = i;
        }

        return min;
    }
}
