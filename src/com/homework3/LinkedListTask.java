package com.homework3;

import java.util.*;

public class LinkedListTask {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Toyota");
        cars.add("Lexus");
        System.out.println("The elements of the linked list before reversing: " + cars);
        cars = reverseLinkedList(cars);
        System.out.println("The elements of the linked list after reversing: " + cars);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> cars) {
        for (int i = 0; i < cars.size() / 2; i++) {
            String temp = cars.get(i);
            cars.set(i, cars.get(cars.size() - i - 1));
            cars.set(cars.size() - i - 1, temp);
        }
        return cars;
    }
}