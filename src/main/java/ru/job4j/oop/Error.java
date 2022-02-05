package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error () {
    }

    public Error (boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main  (String[] args) {
       Error error  = new Error();
       Error error2 = new Error(true, 100, "Error 100");
       Error error3 = new Error(true, 200, "Error 200");
       error.printInfo();
       error2.printInfo();
       error3.printInfo();
    }

    public void printInfo () {
            System.out.println("Активность: " + active);
            System.out.println("Статус: " + status);
            System.out.println("Cообщение: " + message);
    }
}

