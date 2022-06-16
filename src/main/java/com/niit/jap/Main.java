package com.niit.jap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CircleMeasurer circleMeasurer = new CircleMeasurer();
        System.out.println("Please enter the radius of the circle, ex 10.0");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double circumference = circleMeasurer.calculateCircumference(radius);
        System.out.println("The circumference of the circle is " + circumference + ".");
        double area = circleMeasurer.calculateArea(radius);
        System.out.println("The area of the circle is " + area + ".");
        scanner.close();
    }
}