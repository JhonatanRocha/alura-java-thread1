package br.com.thread1.model;

import java.util.Properties;

public class Principal {
    Properties properties1;
    Properties properties2;
    Properties properties3;

    public void lerPropriedades(){
        new Thread(new LeitorPropriedades(properties1, "arquivo1.txt")).start();
        new Thread(new LeitorPropriedades(properties2, "arquivo2.txt")).start();
        new Thread(new LeitorPropriedades(properties3, "arquivo3.txt")).start();
    }
}
