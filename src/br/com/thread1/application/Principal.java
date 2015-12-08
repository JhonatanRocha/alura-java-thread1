package br.com.thread1.application;

import br.com.thread1.model.BuscaNome;

public class Principal {
	public static void main(String[] args) {
		String nomeBuscado = "Jhonatan"; 
		BuscaNome buscaNome1 = new BuscaNome("name-list1.txt", nomeBuscado);
		BuscaNome buscaNome2 = new BuscaNome("name-list2.txt", nomeBuscado);
		BuscaNome buscaNome3 = new BuscaNome("name-list3.txt", nomeBuscado);

		Thread firstThread = new Thread(buscaNome1);
		Thread secondThread = new Thread(buscaNome2);
		Thread thirdThread = new Thread(buscaNome3);
		
		firstThread.start();
		secondThread.start();
		thirdThread.start();
	}
}
