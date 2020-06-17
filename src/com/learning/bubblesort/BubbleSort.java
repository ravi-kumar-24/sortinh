package com.learning.bubblesort;

import java.util.Arrays;
import java.util.stream.Stream;

public class BubbleSort {

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

        for (int lastUnSortedIndex = arr.length -1; lastUnSortedIndex > 0 ; lastUnSortedIndex--) {
            for (int i = 0; i < lastUnSortedIndex ; i++) {
                if(arr[i]>arr[i+1]){
                    swap(arr ,i, i+1);
                }
            }
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
