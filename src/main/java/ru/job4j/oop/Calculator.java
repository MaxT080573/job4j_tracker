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

    public int multiply(int y) {

        return y * x;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = Calculator.sum(1);
        int result2 = Calculator.minus(10);
        int result3 = calculator.divide(20);
        int result4 = calculator.multiply(30);
        int result = calculator.sumAllOperation(50);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result);

    }

    public int sumAllOperation(int number) {
        return sum(number) + minus(number) + divide(number) + multiply(number);

    }
}
