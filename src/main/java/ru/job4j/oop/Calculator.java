package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int y) { return y * x; }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = Calculator.sum(1);
        int result1 = Calculator.minus(10);
        int result2 = calculator.divide(20);
        int result3 = calculator.multiply(30);
        int result4 = calculator.sumAllOperation();
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }

    public int sumAllOperation () {
        return sum(1) + minus(10) + divide(20) + multiply(30);

    }
}
