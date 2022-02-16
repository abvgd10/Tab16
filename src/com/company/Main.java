package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3.14159);
        int radius = 2;
        double q = Circle.area(radius * radius * circle.getPI());
        double w = Circle.circumference(circle.getPI() * 2 * radius);
        System.out.println("area " + q);
        System.out.println("circumference " + w);
    }
}
