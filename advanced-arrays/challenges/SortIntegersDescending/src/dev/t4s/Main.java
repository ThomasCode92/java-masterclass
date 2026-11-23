package dev.t4s;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntegers = SortedArray.getIntegers(5);
        SortedArray.printArray(myIntegers);

        int[] sorted = SortedArray.sortIntegers(myIntegers);
        SortedArray.printArray(sorted);
    }
}
