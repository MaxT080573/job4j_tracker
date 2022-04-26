package ru.job4j.pojo;

public class College {
    public static void main (String[] args) {
        Student student = new Student();
        student.setName("Smirnov Ivan Petrovich ");
        student.setGroup("ER-87-1 ");
        student.setDate("27/07/1987");

        System.out.println(student.getName() + student.getGroup() +  student.getDate());
    }
}