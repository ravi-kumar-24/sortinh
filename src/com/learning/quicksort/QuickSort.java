package com.learning.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] unSortedArr = {43, 7, 1, 22 ,-17, 66, -9, 14,23,5};
         quickSort(unSortedArr, 0, unSortedArr.length-1);
        Arrays.stream(unSortedArr).forEach(x -> System.out.print(x +"  "));
        System.out.println();
        for (int x:unSortedArr) {
            System.out.print(x+", ");
        }
    }

    private static void quickSort(int[] unSortedArr, int start, int end) {

        if(start <end){
            int pIndex = partition(unSortedArr, start, end);
            quickSort(unSortedArr, start, pIndex -1);
            quickSort(unSortedArr, pIndex + 1, end);
        }
    }

    private static int partition(int[] unSortedArr, int start, int end) {
        int pivot = unSortedArr[end];
        int partionIndex = start;
        for (int i = start; i < end ; i++) {
            if(unSortedArr[i] <=pivot){
                swap(unSortedArr, i, partionIndex);
                partionIndex ++;
            }
        }
        swap(unSortedArr, partionIndex, end);
        return  partionIndex;

    }
    private static void swap(int[] arr, int i, int j){
        if(i==j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
