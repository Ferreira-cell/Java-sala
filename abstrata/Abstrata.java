package com.mycompany.abstrata;

public class Abstrata {

    public static void main(String[] args) {
        
        Forma formac = new Circulo("Cinza", 1, 2, 3.0);
        formac.calcularArea();
        
        Forma formar = new Retangulo("Pessoa", 0, 0);
        formar.calcularArea();
        
        Retangulo r = new Retangulo("Azul", 0, 0);
        r.setComprimento(10);
        r.setLargura(20);
        r.calcularArea();
    }
}
