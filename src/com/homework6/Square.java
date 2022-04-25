package com.homework6;

public class Square extends Shape{
    @Override
    Double getArea(double d) {
        System.out.println("Square area is" + (d * d) + "m2");
        return (d * d);
    }

    @Override
    Double getPerimeter(double d) {
        return (4 * d);
    }
}
