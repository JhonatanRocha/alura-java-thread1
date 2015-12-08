package br.com.thread1.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BuscaNome implements Runnable {

	private String nomeArquivo;
	private String procurado;
	
	public BuscaNome(String nomeArquivo, String procurado) {
		this.nomeArquivo = nomeArquivo;
		this.procurado = procurado;
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new FileReader(nomeArquivo));
			int numeroDaLinha = 1;
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				if(line.contains(procurado)){
					System.out.println("Encontramos o nome procurado em: " + nomeArquivo + " - "+ numeroDaLinha +": " + line);
				}
				numeroDaLinha++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
