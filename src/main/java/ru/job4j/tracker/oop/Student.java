package ru.job4j.tracker.oop;

public class Student {
    public void music() {
        System.out.println("Tra Tra Tra");
    }
    public void songs() {
        System.out.println("I believe I can fly");
    }
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.songs();
        petya.songs();
        petya.songs();
    }
}
