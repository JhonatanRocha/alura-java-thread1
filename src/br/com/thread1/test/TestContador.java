package br.com.thread1.test;

import br.com.thread1.model.Contador;

public class TestContador {
	
	public static void main(String[] args) {
		Thread[] threads = new Thread[10];
		
		System.out.println("Inicio do Teste");
		
		for (int i = 0; i < threads.length; i++) {
			Contador contador = new Contador(Integer.toString(i+1) + "º Thread");
			threads[i] = new Thread(contador);
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		
		System.out.println("Fim do teste");
	}
}
