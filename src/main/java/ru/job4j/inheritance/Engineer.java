package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String builder;

    private String programmer;

    public Engineer(String name, String surname, String education, String birthday, String builder, String programmer) {
        super(name, surname, education, birthday);
        this.builder = builder;
        this.programmer = programmer;
    }

    public String getBuilder() {

        return this.builder;
    }

    public String getProgrammer() {

        return this.programmer;
    }
}
