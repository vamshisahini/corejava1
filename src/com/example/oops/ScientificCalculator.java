package com.example.oops;

public class ScientificCalculator extends calculator {
    ScientificCalculator(){
        System.out.println("CALLED CONSTRUCTOR");
        firstNumber =24;
        secondNumber =36;
    }
    public double sinValue(double angle) {
        return Math.sin(angle);

    }

    public double cosValue(double angle) {
        return Math.cos(angle);

    }

    public double tanValue(double angle) {
        return Math.tan(angle);

    }

    public double exponentialValue(double x, double y) {
        return Math.pow(x, y);
    }

     public double divide(){
        if(secondNumber == 0) {
             System.out.println("SECOND OPERAND IS ZERO, DIVISION IS NOT POSSIBLE");
             return 0;
         }
         return firstNumber/secondNumber;
     }
}

