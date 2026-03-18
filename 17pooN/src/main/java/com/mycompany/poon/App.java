package com.mycompany.poon;

import ucb.estudo.model.Pessoa;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Pessoa p1 = new Pessoa();
        
        p1.setNome("João N");
        p1.setCpf("156.661.789-79");
        p1.setAltura(1.75);
        p1.setPeso(80);
        
        Pessoa p2 = new Pessoa();
        
        p2.setNome("Maria N");
        p2.setCpf("112.235.653-48");
        p2.setAltura(1.65);
        p2.setPeso(50);
        
        //Exibir dados da Pessoa 01
        System.out.println("Olá, seja bem-vindo: " + p1.getNome());
        p1.exibirIMC();
        //Exibir dados da Pessoa 02
        System.out.println("Olá seja bem-vinda: " + p2.getNome());
        p2.exibirIMC();
        
        Pessoa p3 = new Pessoa("Andre", "$56.435.345-45", 1.90, 85);
        System.out.println("Olá seja bem-vinda: " + p3.getNome());
        p3.exibirIMC();
    }
    
}