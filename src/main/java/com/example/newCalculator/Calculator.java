package com.example.newCalculator;

public class Calculator {
    public Integer sum(Integer val1, Integer val2){
        return val1+val2;
    }

    public Integer substraction(Integer val1, Integer val2){
        return val1 - val2;
    }

    public Integer multiply(Integer val1, Integer val2){
        return val1*val2;
    }

    public Integer division(Integer val1, Integer val2){
        return val1/val2;
    }


    public Integer elevate(Integer val1, Integer val2) {
        return (int) Math.pow(val1, val2);

    }

    public Integer sqrt(Integer val1, Integer val2) {
        return (int) Math.pow(val1, 1.0/val2);

    }

}
