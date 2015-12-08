package br.com.thread1.model;

public class InserirElementos implements Runnable {

	private int numeroThread;
	
	public InserirElementos(int numeroThread){
		this.numeroThread = numeroThread;
	}
	
	@Override
	public void run() {
		synchronized (Armazenamento.instanceOfArmazenamento) {
			for (int i = 1; i <= 100; i++) {
				Armazenamento.instanceOfArmazenamento.addElement("Thread" + numeroThread + " - " + i);				
			} 
		}
	}
}