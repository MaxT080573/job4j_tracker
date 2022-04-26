package ru.job4j.threads;

public class Main {

    public static void main(String[] args) throws Exception {
        ThreadOne myThread = new ThreadOne();
        ThreadTwo myThread2 = new ThreadTwo();

        myThread.start();
        myThread2.start();

    }
}

class ThreadOne extends Thread implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("поток 1");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadTwo extends Thread implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("поток 2");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
