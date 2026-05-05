/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstrata;

/**
 *
 * @author victoraugusto.silva
 */
public class Circulo extends Forma{
    
    private double raio;
    
    public Circulo(String cor, double x, double y, double raio){
        super(cor, x, y);
        this.raio = raio;
          
    }
    
    @Override
    public void calcularArea(){
        System.out.println("Calculo da Area");
        System.out.println(Math.PI * raio * raio);
    }
}
