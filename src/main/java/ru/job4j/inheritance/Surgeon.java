package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String cutoff;

    public Surgeon(String name, String surname, String education, String birthday, String dentist, String surgeon, String cutoff) {
        super(name, surname, education, birthday, dentist, surgeon);
        this.cutoff = cutoff;
    }

    public String develop(Surgeon cut) {

        return "Cut off";
    }

}
