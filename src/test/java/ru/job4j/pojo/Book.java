package ru.job4j.pojo;

public class Book {
    private String name;
    private int countpages;

    public Book(String name, int countpages) {
        this.name = name;
        this.countpages = countpages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountpages() {
        return countpages;
    }

    public void setCountpages(int countpages) {
        this.countpages = countpages;
    }
}
