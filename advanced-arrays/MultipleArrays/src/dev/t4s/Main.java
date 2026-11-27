package dev.t4s;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2 length = " + array2.length);

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var inner = array2[i];
            for (int j = 0; j < inner.length; j++) {
//                System.out.print(array2[i][j]+ " ");
                array2[i][j] = (i * 10) + (j + 1);
            }
//            System.out.println();
        }

//        for (var outer : array2) {
//            for (var inner : outer) {
//                System.out.print(inner + " ");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(array2));
    }
}
