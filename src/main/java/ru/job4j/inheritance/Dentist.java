package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String toothmaker;

    public Dentist(String name, String surname, String education, String birthday, String dentist, String surgeon, String toothmaker) {
        super(name, surname, education, birthday, dentist, surgeon);
        this.toothmaker = toothmaker;
    }

    public String develop(Dentist make) {

        return "Tooth make";
    }

}
