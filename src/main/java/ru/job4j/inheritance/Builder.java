package ru.job4j.inheritance;

public class Builder extends Engineer {

        private String stovemaker;

    public Builder(String name, String surname, String education, String birthday, String builder, String programmer, String stovemaker) {
            super(name, surname, education, birthday, builder, programmer);
            this.stovemaker = stovemaker;
        }

        public String stove(Builder make) {

            return "Make stove";
        }
}
