package ru.job4j.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }

    public String generate1(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
