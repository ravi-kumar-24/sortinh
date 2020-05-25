package com.learning.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] unSortedArr = {43, 7, 1, 22 ,-17, 66, -9, 14,23,5};
        sort(unSortedArr);
        Arrays.stream(unSortedArr).forEach(x -> System.out.print(x +"  "));
        System.out.println();
        for (int x:unSortedArr) {
            System.out.print(x+", ");
        }
    }

    public static void sort(int[] arr){

        for (int lastUnSortedIndex = arr.length-1; lastUnSortedIndex >0 ; lastUnSortedIndex--) {
            int largest =0;
            for (int i = 1; i <= lastUnSortedIndex; i++) {
                   if(arr[i]>arr[largest]) {
                       largest =i;
                   }
            }
            swap(arr, largest,lastUnSortedIndex);
        }

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
