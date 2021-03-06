package com.homework6;

public class Circle extends Shape{
    @Override
    Double getArea(double d) {
        return (Math.PI * Math.pow(d, 2));
    }

    @Override
    Double getPerimeter(double d) {
        return (2 * Math.PI * d);
    }
}
