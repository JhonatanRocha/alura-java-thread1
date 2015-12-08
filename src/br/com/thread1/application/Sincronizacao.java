package br.com.thread1.application;

import br.com.thread1.model.Incrementador;

public class Sincronizacao {
	public static Integer variavel = 0;

    public static void main(String[] args) throws InterruptedException {
        Incrementador incrementador1 = new Incrementador();
        Incrementador incrementador2 = new Incrementador();

        new Thread(incrementador1).start();
        new Thread(incrementador2).start();

        synchronized (incrementador1) {
            if(!incrementador1.executou){
                incrementador1.wait();
            }
            synchronized (incrementador2) {
                if(!incrementador2.executou){
                    incrementador2.wait();
                }
                System.out.println(variavel);
            }
        }
    }
}
