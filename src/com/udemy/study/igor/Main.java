package com.udemy.study.igor;

public class Main {
    public static void main(String[] args) {
        SpeedConverter.printConversion(0.0);
        SpeedConverter.printConversion(10.5);
        //Test for negative values
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(-1.0);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);

    }
}
