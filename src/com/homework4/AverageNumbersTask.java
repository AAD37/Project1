package com.homework4;

public class AverageNumbersTask {

    static double a = 5.5;
    static double b = 9.5;
    static double c = 12.5;
    static double sum = 0;

    public static void main (String[] args) {

        System.out.println(calculateAverage(a,b,c));
    }
    public static double calculateAverage(double a, double b, double c){
        return (a + b +c / 3);

    }
    public static double calculateAverage(double sum) {
        return sum / 3;
    }
}
