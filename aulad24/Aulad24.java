package com.mycompany.aulad24;

public class Aulad24 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Maria A.");
        p1.setIdade(50);
        System.out.println("Nome: " + p1.getNome() + " Sua idade eh: " + p1.getIdade());

        Pessoa p2 = new Pessoa("Joao S.", 60);
        System.out.println("Nome:" + p2.getNome() + "Sua idiade eh:" + p2.getIdade());

        Calculadora c = new Calculadora();
        System.out.println("A soma das idade eh: " + c.somar(p1.getIdade(), p2.getIdade()));

        System.out.println("Soma de dois numeros: " + Calculadora.somar(65.7, 50));

        double[] notas = {10, 8 ,5, 9, 7.5, 9.5};
        System.out.println("Media dos valores eh: " + Calculadora.calcularMedia(notas));
    }
}
