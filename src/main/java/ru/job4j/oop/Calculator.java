package ru.job4j.oop;

public class Calculator {

    private static final int Х = 5;

    private static final int y = 15;

    private static final int a = 5;

    public static int sum(int y) {
        return Х + y;
    }

    public static int minus(int y) {
        return y - Х;
    }

    public int divide(int y) {
        return y / Х;
    }

    public int multiply(int a) {
        return Х * a;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = Calculator.sum(y);
        int result1 = Calculator.minus(y);
        int result2 = calculator.divide(y);
        int result3 = calculator.multiply(a);
        int result4 = calculator.sumAllOperation(y);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    public int sumAllOperation(int y) {
        return sum (y) + minus (y) + divide (y) + multiply (a);

    }

}
