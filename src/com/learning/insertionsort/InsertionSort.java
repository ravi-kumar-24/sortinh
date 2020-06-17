package com.learning.insertionsort;

import java.util.Arrays;

public class InsertionSort {

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
        for (int firstUnSortedIndex = 1; firstUnSortedIndex < arr.length ; firstUnSortedIndex++)
        {
            int insertedElement = arr[firstUnSortedIndex];
            int i;
                for (i = firstUnSortedIndex; i >0 && arr[i-1]>insertedElement ; i--)
                {
                      arr[i] = arr[i-1];
                }
            arr[i] =insertedElement;
        }
    }
}
