package br.com.thread1.application;

public class Exercise4 implements Runnable{

    public static void main(String[] args) {
        new Thread(new Exercise4()).start();
        new Thread(new Exercise4()).start();
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getId() + "- " +i);
        }
    }
}