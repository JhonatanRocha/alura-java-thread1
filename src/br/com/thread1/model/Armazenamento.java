package br.com.thread1.model;

public class Armazenamento {
	
	public static Armazenamento instanceOfArmazenamento = new Armazenamento();
	
	private String[] listaStrings = new String[1000];
	private int contador = 0;
	
	public void addElement(String str){
		listaStrings[contador] = str;
		contador++;
	}
	
	public String[] recuperaLista() {
		return listaStrings;
	}
}
