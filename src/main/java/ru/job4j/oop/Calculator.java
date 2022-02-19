package ru.job4j.oop;

public class Calculator {

    private static final int X = 5;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = Calculator.sum(10);
        int result1 = Calculator.minus(10);
        int result2 = calculator.divide(5);
        int result3 = calculator.multiply(5);
        int result4 = calculator.sumAllOperation(result, result1, result2, result3);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    public static int sum(int y) {
        return X + y;
    }

    public static int minus(int y) {
        return X - y;
    }

    public int divide(int y) {
        return X / y;
    }

    public int multiply(int a) {
        return X * a;
    }

    public int sumAllOperation(int result, int result1, int result2, int result3) {
        return result + result1 + result2 + result3;
    }

}
