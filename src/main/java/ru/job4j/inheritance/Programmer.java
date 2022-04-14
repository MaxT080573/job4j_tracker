package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String frontend;

    public Programmer (String name, String surname, String education, String birthday, String builder, String programmer, String frontend) {
        super(name, surname, education, birthday, builder, programmer);
        this.frontend = frontend;
    }

    public String develop (Programmer make) {

        return "Make interface";
    }
}
