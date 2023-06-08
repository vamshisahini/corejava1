package com.example.oops;

public class Testclass {
    public static void main(String[] args) {
        ScientificCalculator scalcobj = new ScientificCalculator();
        ScientificCalculator scalcobjTwo = new ScientificCalculator();
        double addResult = scalcobjTwo.add();
        System.out.println("ADD RESULT FOR OBJECT 2:" + addResult);
        double result = scalcobj.add();
        double resultAdd = scalcobj.add(45);
        double divisionResult = scalcobj.divide();
        double resultOne = scalcobj.sinValue(30);
        System.out.println("result = " + result);
        System.out.println("SIN VALUE = " + resultOne);
        System.out.println("ADD VALUE = " + resultAdd);
        System.out.println("DIVISION VALUE = " + divisionResult);
    }
}
