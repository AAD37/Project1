package com.homework4;

public class SmallestNumTask {

    public static void main(String[] args) {

        int a = 52;
        int b = 15;
        int c = 18;

        int smallest;

        //find the smallest
        if(a<b) {
            if(c<a) {
                smallest = c;
            } else {
                smallest = a;
            }
        } else {
            if(b<c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }

        System.out.println(smallest + " is the smallest.");
    }
}
