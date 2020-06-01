package com.learning.redixsort;

import java.util.Arrays;

public class RedixSort {

        public static void main(String[] args) {
          //  int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };
            int[] radixArray = { 4125, 2531, 1330, 3122, 1554, 5120 };
            radixSort(radixArray, 10, 4);
            for (int i = 0; i < radixArray.length; i++) {
                //System.out.println(radixArray[i]);
            }
        }

        public static void radixSort(int[] input, int radix, int width) {
            for (int i = 0; i < width; i++) {
                radixSingleSort(input, i, radix);
            }
        }

        public static void radixSingleSort(int[] input, int position, int radix) {
            int numItems = input.length;
            int[] tempArray = new int[radix];
            for (int value: input) {
                tempArray[getDigit(position, value, radix)]++;
            }

            // Adjust the count array
            for (int j = 1; j < radix; j++) {
                tempArray[j] += tempArray[j - 1];
            }

            Arrays.stream(tempArray).forEach(x -> System.out.println(x +" "));
            System.out.println("===============================================");
            int[] temp = new int[numItems];
            for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
                temp[--tempArray[getDigit(position, input[tempIndex], radix)]] =
                        input[tempIndex];
            }

            for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
                input[tempIndex] = temp[tempIndex];
            }
        }

        public static int getDigit(int position, int value, int radix) {
            return value / (int) Math.pow(radix, position) % radix;
        }
    }