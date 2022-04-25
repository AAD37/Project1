package com.homework6;

public class MyMainClass {

    public static void main(String[] args) {

        Circle s1 = new Circle();
        System.out.println(s1.getArea(3.0));
        System.out.println(s1.getPerimeter(6.0));

        Shape s2 = new Circle();
        System.out.println(s2.getArea(3.0));
        System.out.println(s2.getPerimeter(6.0));

        Circle s3 = (Circle) s2;
        System.out.println(s2.getPerimeter(5.0));

        Square s4 = new Square();
        System.out.println(s4.getArea(4.0));
        System.out.println(s4.getPerimeter(4.0));

    }



}
