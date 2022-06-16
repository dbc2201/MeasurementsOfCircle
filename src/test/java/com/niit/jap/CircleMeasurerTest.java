package com.niit.jap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CircleMeasurerTest {

    private CircleMeasurer circleMeasurer;

    @BeforeEach
    void setUp() {
        circleMeasurer = new CircleMeasurer();
    }

    @ParameterizedTest(name = "calculateCircumference({arguments})")
    @ValueSource(doubles = {0.0, 3.0, 10.0, 25.0, 30.0, 50.0, 75.0, 100.0})
    void calculateCircumference(double radius) {
        double calculatedCircumference = circleMeasurer.calculateCircumference(radius);
        Assertions.assertEquals(
                2.0 * Math.PI * radius,
                calculatedCircumference,
                0.1,
                "The calculated circumference is not correct!"
        );
    }

    @ParameterizedTest(name = "calculateArea({arguments})")
    @ValueSource(doubles = {0.0, 3.0, 10.0, 25.0, 30.0, 50.0, 75.0, 100.0})
    void calculateArea(double radius) {
        double calculatedArea = circleMeasurer.calculateArea(radius);
        Assertions.assertEquals(
                Math.PI * radius * radius,
                calculatedArea,
                0.1,
                "The calculated area is not correct!"
        );
    }
}