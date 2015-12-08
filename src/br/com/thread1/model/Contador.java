package br.com.thread1.model;

public class Contador implements Runnable {

	private String nome;
	
	public Contador(String nome) {
		this.nome = nome;
	}

	@Override
	public void run() {
		for(int i = 1; i<100; i++){
			System.out.println("Thread: " + nome + " está contando o número " + i);
		}
	}
}