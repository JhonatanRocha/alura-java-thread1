package br.com.thread1.model;

public class Armazenamento {
	
	public static Armazenamento instanceOfArmazenamento = new Armazenamento();
	
	private String[] listaStrings = new String[1000];
	private int contador = 0;
	
	public synchronized void addElement(String str){
		listaStrings[contador] = str;
		contador++;
		if(contador == 1000){
			this.notify();
		}
	}
	
	public String[] recuperaLista() {
		return listaStrings;
	}

	public int getContador() {
		return contador;
	}
}
