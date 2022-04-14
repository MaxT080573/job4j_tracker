package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String dentist;

    private String surgeon;

    public Doctor(String name, String surname, String education, String birthday, String dentist,String surgeon) {
        super(name, surname, education, birthday);
        this.dentist = dentist;
        this.surgeon = surgeon;
    }

    public String getBuilder () {
        return this.dentist;
    }

    public String getProgrammer () {
        return this.surgeon;
    }

}
