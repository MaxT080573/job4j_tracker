package ru.job4j.tracker.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
     DummyDic eng = new DummyDic();
     String say = eng.engToRus("disappearance");
        System.out.println(say);
    }
}

