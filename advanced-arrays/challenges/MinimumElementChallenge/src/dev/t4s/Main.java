package dev.t4s;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int min = findMin(returnedArray);
        System.out.println("The minimum value is: " + min);

//        reverse(returnedArray);
//        System.out.println("Final: " + Arrays.toString(returnedArray));

        int[] reversedCopy = reverseCopy(returnedArray);
        System.out.println("After reverse: " + Arrays.toString(returnedArray));
        System.out.println("Reversed copy: " + Arrays.toString(reversedCopy));
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

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("-->" + Arrays.toString(array));
        }
    }

    private static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;

        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }

        return reversedArray;
    }
}
