package com.homework;

import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter side A, side B, side C:");

        double sideA = myObj.nextDouble();
        double sideB = myObj.nextDouble();
        double sideC = myObj.nextDouble();

        System.out.println("The perimeter of a triangle is" + " " + (sideA + sideB + sideC));
    }
}