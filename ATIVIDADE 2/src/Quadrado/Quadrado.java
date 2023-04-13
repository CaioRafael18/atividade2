package Quadrado;

public class Quadrado {
    private int lado;
    
    public Quadrado(int lado){
        this.lado = lado;
    }

    public int calcularArea(){
        return lado * lado;
    }

    public int calcularPerimetro(){
        return lado * 4;
    }
}
