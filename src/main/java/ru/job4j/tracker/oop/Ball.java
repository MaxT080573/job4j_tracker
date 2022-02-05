package ru.job4j.tracker.oop;

public class Ball {

    public void tryRun(Boolean condition) {
        if (!condition) {
            System.out.println("Колобок съеден");
        } else {
            System.out.println("Колобок сбежал");
        }
    }

    public static void main(String[] args) {
        Ball says = new Ball();
        says.tryRun(true);

    }
}
