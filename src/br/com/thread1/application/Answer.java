package br.com.thread1.application;

public class Answer{
	
    public static void main(String[] args){
        Runnable r = new Runnable(){
            public void run(){
                System.out.println("resposta");
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
