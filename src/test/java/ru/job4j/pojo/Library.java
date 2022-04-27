package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book sky = new Book("Sky", 55);
        Book earth = new Book("Earth", 122);
        Book fire = new Book("Fire", 191);
        Book cleanCode = new Book("Clean code", 777);
        Book[] book = new Book[4];
        book[0] = sky;
        book[1] = earth;
        book[2] = cleanCode;
        book[3] = fire;
        for (Book bk : book) {
            System.out.println(bk.getName() + " pages " + bk.getCountpages());
        }
        System.out.println("Replace 0 to 3.");
        book[0] = fire;
        book[3] = sky;
        for (Book bk : book) {
            System.out.println(bk.getName() + " pages " + bk.getCountpages());
        }
        System.out.println("Shown only book's name Clean code");
        for (Book bk : book) {
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " pages " + bk.getCountpages());
            }
        }
    }
}
