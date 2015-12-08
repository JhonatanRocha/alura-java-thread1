package br.com.thread1.test;

import br.com.thread1.model.Armazenamento;
import br.com.thread1.model.InserirElementos;

public class TestInsercaoElementos {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread[] listaThreads = new Thread[10];
	
		for (int i = 1; i <= listaThreads.length; i++) {
			listaThreads[i-1] = new Thread(new InserirElementos(i));
		}
		
		for (int i = 0; i < listaThreads.length; i++) {
			listaThreads[i].start();
		}
		
		synchronized (Armazenamento.instanceOfArmazenamento) {
			
			if(Armazenamento.instanceOfArmazenamento.getContador() < 1000) {
				
				Armazenamento.instanceOfArmazenamento.wait();
				String[] listaString = Armazenamento.instanceOfArmazenamento.recuperaLista();
				
				for (int i = 0; i < 1000; i++) {
					System.out.println(listaString[i]);
				}
			}
		}
	}
}
