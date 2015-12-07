package br.com.thread1.test;

import java.net.ServerSocket;
import java.net.Socket;

import br.com.thread1.model.TrataEmParalelo;

public class testServerSocket {

	public static void main(String[] args) throws Exception {
		ServerSocket servidor = new ServerSocket (12345);
		while (true) {
		    Socket cliente = servidor.accept();
		    Thread t = new Thread(new TrataEmParalelo(cliente));
		    t.start();
		}
	}
}
