package com.homework3;

public class ArraySumTask {
    public static void main(String[] args) {
        int[] myArray = {3, 5, 6, 7, 2};

        int sum = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            sum += myArray[i];

        }

        System.out.println(sum);
    }
}
