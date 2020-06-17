package com.learning.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] unSortedArr = {43, 7, 1, 22, -17, 66, -9, 14, 23, 5};
        mergeSort(unSortedArr, 0, unSortedArr.length);
        Arrays.stream(unSortedArr).forEach(x -> System.out.print(x + "  "));
        System.out.println();
        for (int x : unSortedArr) {
            System.out.print(x + ", ");
        }
    }

    public static void mergeSort(int[] intArray, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(intArray, start, mid);
        mergeSort(intArray, mid, end);

        merge(intArray, start, mid, end);
    }

    private static void merge1(int[] intArray, int start, int mid, int end) {
        if(intArray[mid-1] <= intArray[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int temp[] =  new int[end-start];

        while (i < mid && j < end){
            temp[tempIndex++] = intArray[i] <= intArray[j] ? intArray[i++] : intArray[j++];
        }
        System.arraycopy(intArray, i, intArray, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, intArray, start, tempIndex );

    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
