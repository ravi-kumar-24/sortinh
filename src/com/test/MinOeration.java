package com.test;

import java.util.*;

public class MinOeration {

    /* Function to print minimum operation required
      to make all elements of an array equal */
    static void printMinOp(int arr[]) {
        long before = System.currentTimeMillis();
        int arraySum, smallest, arr_size = arr.length;
        arraySum = 0;
        smallest = arr[0];
        for (int i = 0; i < arr_size; i++) {
            /* If current element is smaller than
               update smallest */
            if (arr[i] < smallest)
                smallest = arr[i];

            /*find array sum */
            arraySum += arr[i];
        }

        int minOperation = arraySum - arr_size * smallest;
        long after = System.currentTimeMillis();
        System.out.println("move " + minOperation + " Time taken " + (after - before));
        /* Print min operation required */
        System.out.println("Minimum Operation = " +
                minOperation);

    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        int arr[] = {1, 6, 2, 4, 3};
        printMinOp(arr);
        find(arr);
        int arr1[] = {1, 6, 2, 4, 3};
    }

    public static void find(int[] arr) {
        long before = System.currentTimeMillis();
        int move = 0;
        int totoalMoves = 0;
        while (allNoSame(arr)) {
            int largest = largestNumberIndexInArray(arr);
            for (int j = 0; j < arr.length; j++) {
                if (j != largest) {
                    arr[j]++;
                }
                totoalMoves += 1;
            }
            move = move + 1;
            // Arrays.stream(arr).forEach(x -> System.out.print(x+" "));
            // System.out.println();
        }
        long after = System.currentTimeMillis();
        System.out.println("total moves " + totoalMoves + " min op " + move + " Time taken " + (after - before));
    }

    private static boolean allNoSame(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    private static boolean allNoSameSmall(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int largestNumberIndexInArray(int[] arr) {
        int largestIndex = 0;
        int largerstElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largerstElement) {
                largerstElement = arr[i];
                largestIndex = i;
            }
        }
        return largestIndex;
    }
}




