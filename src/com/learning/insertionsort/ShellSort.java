package com.learning.insertionsort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] unSortedArr = {43, 7, 1, 22 ,-17, 66, -9, 14,23,5};
        sort(unSortedArr);
        Arrays.stream(unSortedArr).forEach(x -> System.out.print(x +"  "));
        System.out.println();
        for (int x:unSortedArr) {
            System.out.print(x+", ");
        }
    }

       public static void sort(int[] intArray){
            int totalIteration= 0;
           for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
               for (int i = gap; i < intArray.length; i++) {
                   int newElement = intArray[i];
                   int j = i;
                   while (j >= gap && intArray[j - gap] > newElement) {
                       intArray[j] = intArray[j - gap];
                       j -= gap;
                       totalIteration++;
                   }
                   intArray[j] = newElement;
               }

           }
           System.out.println("Total Iteration"+totalIteration);
    }
}
