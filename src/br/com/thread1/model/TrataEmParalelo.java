package br.com.thread1.model;

import java.net.Socket;
import java.util.Scanner;

public class TrataEmParalelo implements Runnable{
   
	public Socket cliente;
   
	public TrataEmParalelo(Socket cliente){
		this.cliente = cliente;
    }
    
    public void run(){
        try{
        	Scanner s = new Scanner(this.cliente.getInputStream());
        	while(s.hasNextLine()){
        		System.out.println(s.nextLine());
        	}
        	s.close();
        } catch(Exception e) {
        	e.printStackTrace();
        }
    }	
}

