package com.mycompany.abstrata;

public abstract class Forma {
    
    protected String cor;
    protected double x;
    protected double y;
    
    public Forma(String pcor, double px, double py){
        this.cor = pcor;
        this.x = px;
        this.y = py;
    }
    
    public abstract void calcularArea();
    
    public void mover(double px, double py){
        x += px;
        y += py;
    }
      
}
