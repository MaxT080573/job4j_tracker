package ru.job4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    LocalDateTime created = LocalDateTime.now();

        public LocalDateTime getCreated() {
            return created;
        }

        private int id;
        private String name;

    public Item() {
        }

    public Item(String name) {
            this.name = name;
        }

    public Item(int id, String name) {
            this.name = name;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id){
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
