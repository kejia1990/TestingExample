package com.example.testing.testingexample;

/**
 * Created by on 15/6/4.
 */
public class Calculator {

    public double sum(double a, double b) {
        return a + b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

}
