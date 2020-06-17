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
    //first get the partionIndex, where all the element in left would less than
    // and right of it all the elements are greater than
    // after fisrt iteration pivat is 5
    // int[] unSortedArr = {1,-17,-9,5};
    //sort the elements from start to partition index
    //and from partition index to end of elements
    //this is again call recursive, and first sort the elements of left side
    //then sort the element of right side recursively
    private static void quickSort(int[] unSortedArr, int start, int end) {
        if(start <end){
            int pIndex = partition(unSortedArr, start, end);

            quickSort(unSortedArr, start, pIndex -1);
            quickSort(unSortedArr, pIndex + 1, end);
        }
    }

    //chosen last element as pivot
    //will move all the elements
    //such that all the elements less then pivot would be left side of pivot
    // and all the elements greater then pivot would be right side of pivot
    //finally swap the partionIndex with pivot
    //than return the partition index
    private static int partition(int[] unSortedArr, int start, int end) {
        int pivot = unSortedArr[end];
        int partionIndex = start;
        for (int i = start; i < end ; i++) {
            if(unSortedArr[i] <=pivot){
                swap(unSortedArr, i, partionIndex);
                partionIndex ++;
            }
        }
        swap(unSortedArr, partionIndex, end); //swap the pivot/end index with partition index
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