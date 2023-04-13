package Circulo;

public class Circulo{
    private int raio;
    private double pi =  3.141516;

    public Circulo(int raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return (pi * raio * raio);
    }

    public double calcularPerimetro(){
        return (2 * pi * raio);
    }
}
