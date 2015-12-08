package br.com.thread1.application;

import java.util.Properties;

import br.com.thread1.model.LeitorPropriedades;

public class Answer{
	
    public static void main(String[] args){
    	
    	Properties properties = new Properties();
    	properties.put("SO", "Windows");
    	properties.put("SO", "Linux - Ubunto");
    	properties.put("SO", "Linux - Fedora");
    	properties.put("SO", "Linux - Debian");
    	properties.put("SO", "MacOS");
    	
    	LeitorPropriedades propertiesReader1 = new LeitorPropriedades(properties, "arquivo1.txt");
    	LeitorPropriedades propertiesReader2 = new LeitorPropriedades(properties, "arquivo2.txt");
    	LeitorPropriedades propertiesReader3 = new LeitorPropriedades(properties, "arquivo3.txt");
    	
  	
        Thread t = new Thread(propertiesReader1);
        Thread t2 = new Thread(propertiesReader2);
        Thread t3 = new Thread(propertiesReader3);
        
        t.start();
        t2.start();
        t3.start();
    }
}
